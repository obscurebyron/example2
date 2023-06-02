package example2;

import atqa.web.StatusLine.StatusCode;
import java.io.IOException;
import java.util.List;
import atqa.web.Response;

public class Main {

    public static void main(String[] args) throws IOException {
        var wf = atqa.FullSystem.initialize().start().webFramework;

        // register a handler
        wf.registerPath(
            atqa.web.StartLine.Verb.GET,
            "",
            request -> new Response(StatusCode._200_OK, "<p>Hi there world!</p>",
            List.of("Content-type: text/html")));
    }


}
