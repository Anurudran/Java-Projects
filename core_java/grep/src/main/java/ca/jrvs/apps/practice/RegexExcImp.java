package ca.jrvs.apps.practice;

import java.util.regex.Pattern;

public class RegexExcImp implements RegexExc{
    @Override
    public boolean matchJpeg(String filename) {
        return Pattern.matches(".+(\\.jpeg|\\.jpg)$", filename);
    }

    @Override
    public boolean matchIp(String ip) {
        return Pattern.matches("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$", ip);
    }

    @Override
    public boolean isEmptyLine(String line) {
        return Pattern.matches("/^\\s*$/g", line);
    }

}
