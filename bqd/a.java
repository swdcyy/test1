package bqd.a;
import android.graphics.Matrix;
import android.app.Activity;
import java.lang.String;
import android.view.View;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;
import android.content.res.Resources;
import java.util.Stack;
import z1.e;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.TextView;
import java.lang.CharSequence;
import android.view.ViewGroup;
import java.lang.Math;
import java.util.Locale;
import java.lang.Integer;

public final class a	// class@0002b5
{
    public static final Matrix a;

    static {
       a.a = new Matrix();
    }
    public static String a(Activity p0){
       View view = p0.findViewById(0x1020002);
       if (view == null) {
          return "Activity ["+p0.getClass().getSimpleName()+"] is not initialized yet. ";
       }
       StringBuilder str = new StringBuilder(8192)+"\n";
       Resources resources = view.getResources();
       Stack stack = new Stack();
       stack.push(e.a("", view));
       while (!stack.empty()) {
          e uoe = stack.pop();
          e b = uoe.b;
          uoe = uoe.a;
          int i = 1;
          boolean b1 = (stack.empty() || !uoe.equals(stack.peek().a))? true: false;
          StringBuilder str1 = uoe;
          String str2 = (b1)? "©¸©¤©¤ ": "©À©¤©¤ ";
          StringBuilder str3 = str1+str2+b.getClass().getSimpleName();
          str1 = " "+"id="+b.getId()+a.c(resources, b);
          int visibility = b.getVisibility();
          if (visibility) {
             if (visibility != 4) {
                str1 = (visibility != 8)? str1+", ---": str1+", --G";
             }else {
                str1 = str1+", -I-";
             }
          }else {
             str1 = str1+", V--";
          }
          String str4 = ", ";
          if (!b.getMatrix().equals(a.a)) {
             str1 = str1+str4+"matrix="+b.getMatrix().toShortString();
             int i1 = 0;
             if (!i1 - b.getRotation() && (i1 - b.getRotationX() || i1 - b.getRotationY())) {
                str1 = str1+", rotate=["+b.getRotation()+","+b.getRotationX()+","+b.getRotationY()+"]";
                visibility = b.getWidth() / 2;
                if (!(float)visibility - b.getPivotX()) {
                   visibility = b.getHeight() / 2;
                   if (!(float)visibility - b.getPivotY()) {
                   label_017a :
                      if (!i1 - b.getTranslationX() && (i1 - b.getTranslationY() || i1 - b.getTranslationZ())) {
                         str1 = str1+", translate=["+b.getTranslationX()+","+b.getTranslationY()+","+b.getTranslationZ()+"]";
                      }
                      i1 = 0x3f800000;
                      if (i1 - b.getScaleX() || i1 - b.getScaleY()) {
                         str1 = str1+", scale=["+b.getScaleX()+","+b.getScaleY()+"]";
                      }
                   }
                }
                str1 = str1+", pivot=["+b.getPivotX()+","+b.getPivotY()+"]";
                goto label_017a ;
             }else {
                goto label_017a ;
             }
          }
          if (!b.getPaddingStart() && (!b.getPaddingTop() && (b.getPaddingEnd() || b.getPaddingBottom()))) {
             str1 = str1+str4+"padding=["+b.getPaddingStart()+","+b.getPaddingTop()+","+b.getPaddingEnd()+","+b.getPaddingBottom()+"]";
          }
          ViewGroup$LayoutParams layoutParams = b.getLayoutParams();
          if (layoutParams instanceof ViewGroup$MarginLayoutParams && (layoutParams.leftMargin == null && (layoutParams.topMargin == null && (layoutParams.rightMargin != null || layoutParams.bottomMargin != null)))) {
             str1 = str1+str4+"margin=["+layoutParams.leftMargin+","+layoutParams.topMargin+","+layoutParams.rightMargin+","+layoutParams.bottomMargin+"]";
          }
          str1 = str1+", position=["+b.getLeft()+","+b.getTop()+"]"+", size=["+b.getWidth()+","+b.getHeight()+"]";
          if (b instanceof TextView) {
             str1 = str1+", text=\""+b.getText()+"\"";
          }
          str = str+str3+str1+"\n";
          if (b instanceof ViewGroup) {
             for (int i2 = b.getChildCount() - i; i2 >= 0; i2 = i2 - 1) {
                StringBuilder str5 = uoe;
                str2 = (b1)? "    ": "©¦   ";
                stack.push(e.a(str5+str2, b.getChildAt(i2)));
             }
          }
       }
       return str;
    }
    public static int b(String p0,String p1){
       int i = 0;
       while (p1.length() > 0) {
          int i1 = p1.indexOf("\n");
          int i2 = 200;
          i1 = (i1 < 0)? 200: i1 + 1;
          i1 = Math.min(p1.length(), Math.min(i1, i2));
          Object[] objArray = new Object[]{Integer.valueOf(i),p1.substring(0, i1)};
          String.format(Locale.US, "%02d: %s", objArray);
          p1 = p1.substring(i1);
          i = i + 1;
       }
       return i;
    }
    public static String c(Resources p0,View p1){
       if (p0 == null) {
          return "";
       }
       return " / "+p0.getResourceEntryName(p1.getId());
    }
}
