package org.censorship.censorshipcloud.dns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.net.InetAddress;
import java.util.List;

@RestController(value = "/dns")
public class DnsResolver {

    @Autowired
    DnsResolverService dnsResolverService;

    @RequestMapping("/test")
    public String test(){
        return "Test successfull";
    }

    @RequestMapping("/resolve")
    public List<String> resolveDns(@RequestParam(value="address") String webAddress) throws Exception{
        return dnsResolverService.resolveDns(webAddress);
    }
}
