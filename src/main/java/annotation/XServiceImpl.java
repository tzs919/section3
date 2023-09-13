package annotation;

import org.springframework.stereotype.Service;

@Service("xServiceImpl")
public class XServiceImpl {

    @Append
    public String foo(String val) {
        return val;
    }
}
