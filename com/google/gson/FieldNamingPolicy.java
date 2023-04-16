package com.google.gson.FieldNamingPolicy;
import zk.c;
import java.lang.Enum;
import com.google.gson.FieldNamingPolicy$1;
import java.lang.String;
import com.google.gson.FieldNamingPolicy$2;
import com.google.gson.FieldNamingPolicy$3;
import com.google.gson.FieldNamingPolicy$4;
import com.google.gson.FieldNamingPolicy$5;
import com.google.gson.FieldNamingPolicy$6;
import java.lang.StringBuilder;
import java.lang.Character;
import java.lang.Class;
import java.lang.Object;

public abstract class FieldNamingPolicy extends Enum implements c	// class@00054c
{
    public static final FieldNamingPolicy[] $VALUES;
    public static final FieldNamingPolicy IDENTITY;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DASHES;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DOTS;
    public static final FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES;

    static {
       FieldNamingPolicy$1 u1 = new FieldNamingPolicy$1("IDENTITY", 0);
       FieldNamingPolicy.IDENTITY = u1;
       FieldNamingPolicy$2 u2 = new FieldNamingPolicy$2("UPPER_CAMEL_CASE", 1);
       FieldNamingPolicy.UPPER_CAMEL_CASE = u2;
       FieldNamingPolicy$3 u3 = new FieldNamingPolicy$3("UPPER_CAMEL_CASE_WITH_SPACES", 2);
       FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES = u3;
       FieldNamingPolicy$4 u4 = new FieldNamingPolicy$4("LOWER_CASE_WITH_UNDERSCORES", 3);
       FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES = u4;
       FieldNamingPolicy$5 u5 = new FieldNamingPolicy$5("LOWER_CASE_WITH_DASHES", 4);
       FieldNamingPolicy.LOWER_CASE_WITH_DASHES = u5;
       FieldNamingPolicy$6 u6 = new FieldNamingPolicy$6("LOWER_CASE_WITH_DOTS", 5);
       FieldNamingPolicy.LOWER_CASE_WITH_DOTS = u6;
       FieldNamingPolicy[] uFieldNaming = new FieldNamingPolicy[]{u1,u2,u3,u4,u5,u6};
       FieldNamingPolicy.$VALUES = uFieldNaming;
    }
    public void FieldNamingPolicy(String p0,int p1){
       super(p0, p1);
    }
    public void FieldNamingPolicy(String p0,int p1,FieldNamingPolicy$1 p2){
       super(p0, p1);
    }
    public static String separateCamelCase(String p0,String p1){
       StringBuilder str = "";
       int i = p0.length();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          char c = p0.charAt(i1);
          if (Character.isUpperCase(c) && str.length()) {
             str = str+p1;
          }
          str = str+c;
       }
       return str;
    }
    public static String upperCaseFirstLetter(String p0){
       int i = p0.length() - 1;
       StringBuilder str = null;
       int i1 = 0;
       while (!Character.isLetter(p0.charAt(i1)) && i1 < i) {
          i1 = i1 + 1;
       }
       char c = p0.charAt(i1);
       if (Character.isUpperCase(c)) {
          return p0;
       }
       c = Character.toUpperCase(c);
       if (!i1) {
          return c+p0.substring(1);
       }
       return p0.substring(str, i1)+c+p0.substring((i1 + 1));
    }
    public static FieldNamingPolicy valueOf(String p0){
       return Enum.valueOf(FieldNamingPolicy.class, p0);
    }
    public static FieldNamingPolicy[] values(){
       return FieldNamingPolicy.$VALUES.clone();
    }
}
