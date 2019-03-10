package org.censorship.censorshipcloud.dns;


import org.hibernate.validator.internal.util.privilegedactions.GetClassLoader;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DnsResolverServiceTest {

    Logger logger = LoggerFactory.getLogger(DnsResolverServiceTest.class);

    @Autowired
    DnsResolverService dnsResolverService;


    @Test
    public void contextLoads(){

    }


}
