package learning.core_concepts.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {
    public static String wrapLink(String input) {
        System.out.println(input);
        String regex = "(?<!<a\\s+href=\")\\b(?:https?://)?(www\\.[a-zA-Z0-9\\-]+\\.[a-zA-Z]{2,})(/[\\w\\-\\.~:/?#\\[\\]@!$&'()*+,;=]*)?(?![^<]*</a>)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        StringBuffer result = new StringBuffer();
        while(matcher.find()) {
            String url = matcher.group();
            matcher.appendReplacement(result, "<a href=\"" + url + "\">" + url + "</a>");
        }
        matcher.appendTail(result);
        return result.toString();
    }
}
