package org.nijj.imac.tools;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	static {
		// 创建配置对象 读取hibernate.cfg.xml文件 完成初始化。
		Configuration config = new Configuration().configure();
		// 创建服务注册对象
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder()
				.applySettings(config.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		// 创建会话工厂对象
		sessionFactory = config.buildSessionFactory(ssr);

	}

	// 获取sessionFactory
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}



}
