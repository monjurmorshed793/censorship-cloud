package org.censorship.censorshipcloud.dns;

import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DnsResolverService {

    List<String> resolveDns(String webAddress) throws Exception{
        InetAddress[] address = InetAddress.getAllByName(webAddress);
        List<InetAddress> addressList = Arrays.asList(address);
        return addressList.stream().map(a->a.getHostAddress()).collect(Collectors.toList());
    }
}
