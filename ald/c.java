package ald.c;
import android.content.res.ColorStateList;
import android.graphics.Color;
import java.lang.Math;
import android.widget.ImageView;
import java.lang.Object;
import java.lang.String;
import ukd.a;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable$ConstantState;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.TextView;

public class c	// class@000069
{

    public static ColorStateList a(int p0){
       int[] ointArray1;
       int[][] ointArray = new int[][2]{ointArray1,ointArray1};
       ointArray1 = new int[]{0x10100a7};
       ointArray1 = new int[0];
       int[] ointArray2 = new int[]{c.b(p0, 0x3f000000),p0};
       return new ColorStateList(ointArray, ointArray2);
    }
    public static int b(int p0,float p1){
       return ((p0 & 0xffffff) | (Math.round(((float)Color.alpha(p0) * p1)) << 24));
    }
    public static void c(ImageView p0){
       try{
          Drawable uDrawable = a.d(p0, "mDrawable");
          if (!uDrawable.isStateful() && uDrawable.getConstantState() != null) {
             Drawable uDrawable1 = uDrawable.getConstantState().newDrawable(p0.getResources()).mutate();
             uDrawable1.setAlpha(128);
             StateListDrawable stateListDra = new StateListDrawable();
             int[] ointArray = new int[]{0x10100a7};
             stateListDra.addState(ointArray, uDrawable1);
             int[] ointArray1 = new int[0];
             stateListDra.addState(ointArray1, uDrawable);
             p0.setImageDrawable(stateListDra);
          }
       label_0043 :
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void d(View p0){
       Drawable background = p0.getBackground();
       if (background != null) {
          if (!background.isStateful() && background.getConstantState() != null) {
             Drawable uDrawable = background.getConstantState().newDrawable(p0.getResources()).mutate();
             uDrawable.setAlpha(128);
             StateListDrawable stateListDra = new StateListDrawable();
             int[] ointArray = new int[]{0x10100a7};
             stateListDra.addState(ointArray, uDrawable);
             int[] ointArray1 = new int[0];
             stateListDra.addState(ointArray1, background);
             p0.setBackground(stateListDra);
          }
       }else if(p0 instanceof ImageView){
          ImageView imageView = p0;
          ColorStateList imageTintLis = imageView.getImageTintList();
          if (imageTintLis != null) {
             imageView.setImageTintList(c.a(imageTintLis.getDefaultColor()));
          }else {
             c.c(imageView);
          }
       }
       if (p0 instanceof TextView) {
          ColorStateList textColors = p0.getTextColors();
          if (textColors != null) {
             p0.setTextColor(c.a(textColors.getDefaultColor()));
          }
       }
       return;
    }
}
