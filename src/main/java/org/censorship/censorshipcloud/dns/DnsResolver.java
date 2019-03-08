package org.censorship.censorshipcloud.dns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.List;

@RestController("/dns")
public class DnsResolver {

    @Autowired
    DnsResolverService dnsResolverService;

    @RequestMapping("/resolve")
    public List<String> resolveDns(@RequestParam(value="address") String webAddress) throws Exception{
        return dnsResolverService.resolveDns(webAddress);
    }
}
