package hl9.c;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig;
import e17.i;
import lnc.a1;
import com.yxcorp.utility.TextUtils;
import lnc.c0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.yxcorp.gifshow.comment.utils.d;
import nx9.c;
import java.lang.Number;
import lu7.f;
import android.view.View;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class c	// class@0026c6
{

    public void c(){
       super();
    }
    public static boolean a(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b(p0, new CommentEditorConfig());
    }
    public static boolean b(CharSequence p0,CommentEditorConfig p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (c.d(p0)) {
          i.a(R.style.arg_RES_7f11066a, 0x7f1040dc);
          return true;
       }else if(c.c(p0)){
          i.d(R.style.arg_RES_7f11066a, a1.q(p1.mAtFriendMaxLimitToastResId, p1.mAtFriendMaxLimit));
          return true;
       }else {
          return false;
       }
    }
    public static boolean c(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!TextUtils.x(p0) && !c.e(p0)) {
          Matcher matcher = c0.a.matcher(p0);
          int i = 0;
          while (matcher.find()) {
             int i1 = 1;
             i = i + i1;
             if (i > d.a) {
                return i1;
             }
          }
       }
       return false;
    }
    public static boolean d(CharSequence p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       String obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, uoc, "1");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       boolean b = false;
       if (c.e() && !TextUtils.x(p0)) {
          if (!c.e(p0)) {
             String obj2 = PatchProxy.applyOneRefs(p0, obj, uoc, "4");
             if (obj2 != patchProxyRe) {
                i = obj2.intValue();
             }else {
                Matcher matcher = c0.a.matcher(p0);
                i = p0.length();
                while (matcher.find()) {
                   obj2 = matcher.group(2);
                   obj = matcher.group(1);
                   if (obj2 == null || obj == null) {
                      continue ;
                   }else {
                      int i1 = obj2.length() + 3;
                      i = i - i1;
                      obj2 = f.d(obj2, obj);
                      if (obj2 == null) {
                         continue ;
                      }
                   }
                   int i2 = obj.length() - obj2.length();
                   i = i - i2;
                }
             }
             if (i <= 255) {
             label_0074 :
                return b;
             }
          }
          b = true;
          goto label_0074 ;
       }else if(!TextUtils.x(p0) && p0.length() > 255){
          b = true;
       }
       return b;
    }
    public static boolean e(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TextUtils.x(p0)) {
          return b;
       }
       if (p0.length() > 1024) {
          b = true;
       }
       return b;
    }
    public static void f(View p0,Context p1,CharSequence p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "5")) {
          return;
       }
       if (p0 != null && p1 != null) {
          Drawable drawable = (c.d(p2) || c.c(p2))? p1.getResources().getDrawable(R.drawable.arg_RES_7f0801cd): p1.getResources().getDrawable(R.drawable.arg_RES_7f0801cb);
          p0.setBackground(drawable);
       }
       return;
    }
}
