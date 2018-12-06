package com.test.junit;

import com.test.HibernateUtils;
import org.hibernate.Session;
import org.junit.Test;

public class test {
    @Test
    public void test1() {
        Session currentSession = HibernateUtils.getCurrentSession();
        System.out.println(currentSession);
    }
}
