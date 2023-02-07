package fr.lernejo.todo;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;

@Component
public class ApplicationIdentifierFilter implements Filter {


    private final UUID uuid = UUID.randomUUID();
    String Conversionuuid = uuid.toString();


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if(servletResponse instanceof HttpServletResponse){
            ((HttpServletResponse) servletResponse).setHeader("Instance-ID",Conversionuuid);
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
