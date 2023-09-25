package annotation;

import org.springframework.stereotype.Component;

@Component("xServiceImpl")
public class XServiceImpl {

    @Append(word = "@@@@@@@@@@@@@")
    public String foo(String val) {
        return val;
    }
}
