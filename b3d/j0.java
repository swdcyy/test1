package b3d.j0;
import java.util.ArrayList;
import zwd.c;
import java.util.List;
import zwd.e;
import org.passay.EnglishCharacterData;
import zwd.d;
import java.lang.Object;
import zwd.b;
import zwd.h;
import zwd.n;
import b3d.j0$a;
import zwd.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import java.lang.Boolean;
import zwd.j;
import zwd.p;

public class j0	// class@000330
{
    public static l a;

    static {
       try{
          ArrayList uArrayList = new ArrayList();
          c uoc = new c();
          uoc.b().add(new e(EnglishCharacterData.Digit, 1));
          uoc.b().add(new e(EnglishCharacterData.Special, 1));
          uoc.b().add(new e(EnglishCharacterData.UpperCase, 1));
          uoc.b().add(new e(EnglishCharacterData.LowerCase, 1));
          uoc.b = 2;
          uArrayList.add(uoc);
          uArrayList.add(new h(8, 20));
          uArrayList.add(new j0$a());
          uArrayList.add(new n(8));
          uArrayList.add(new b(j0.a()));
          j0.a = new l(uArrayList);
       }catch(java.lang.Exception e0){
       }
    }
    public void j0(){
       super();
    }
    public static char[] a(){
       char[] obj = PatchProxy.apply(null, null, j0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (EnglishCharacterData.Alphabetical.getCharacters()).toCharArray();
       char[] uocharArray = (EnglishCharacterData.Digit.getCharacters()).toCharArray();
       char[] uocharArray1 = (EnglishCharacterData.Special.getCharacters()).toCharArray();
       char[] uocharArray2 = new char[((obj.length + uocharArray.length) + uocharArray1.length)];
       System.arraycopy(obj, 0, uocharArray2, 0, obj.length);
       int i = obj.length + 0;
       System.arraycopy(uocharArray, 0, uocharArray2, i, uocharArray.length);
       System.arraycopy(uocharArray1, 0, uocharArray2, (i + uocharArray.length), uocharArray1.length);
       return uocharArray2;
    }
    public static boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = p0.length();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          i = i - 1;
          if (i < 0) {
             return false;
          }
          char c = p0.charAt(i);
          int i3 = (c < 'a' || (c <= 'z' || (c >= 'A' && c <= 'Z')))? 1: 0;
          c = (c >= '0' && c <= '9')? 1: 0;
          i1 = (i3 || i1)? 1: 0;
          i2 = (c || i2)? 1: 0;
          if (i1 && i2) {
             break ;
          }
       }
       return true;
    }
    public static boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          return j0.a.a(new j(p0)).b();
       }catch(java.lang.Exception e0){
          return true;
       }
    }
}
