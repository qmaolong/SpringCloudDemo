package filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

/**
 * Created by qmaolong on 2020/6/17
 */
@Component
public class IpFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
//        处理逻辑
//        RequestContext requestContext = RequestContext.getCurrentContext();
//        System.out.println(requestContext.getRequest().getRemoteAddr());
//        String ip = ServletUtil.getClientIP(requestContext.getRequest(), null);
//        if (ip.contains("1")){
//            requestContext.setSendZuulResponse(false);
//            requestContext.setResponseBody("hshshhs");
//        }
        return null;
    }
}
