package ald.e;
import android.view.View;
import com.kuaishou.ax2c.IAttrHost;
import ald.c;
import com.yxcorp.widget.selector.drawable.e;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.widget.selector.drawable.a;
import android.widget.TextView;
import bld.a;
import android.content.res.ColorStateList;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kuaishou.ax2c.TypeArrayIAttrHostImpl;
import java.lang.Exception;
import android.graphics.drawable.LayerDrawable;

public final class e	// class@00006b
{

    public static View a(View p0,IAttrHost p1,IAttrHost p2,IAttrHost p3,IAttrHost p4,IAttrHost p5,IAttrHost p6){
       int i1;
       int index;
       View view = p0;
       IAttrHost iAttrHost = p1;
       IAttrHost iAttrHost1 = p2;
       IAttrHost iAttrHost2 = p6;
       int i = 0;
       if (!p1.getIndexCount() && (!p3.getIndexCount() && !p5.getIndexCount())) {
          if (p2.getIndexCount() > 0 && iAttrHost1.getBoolean(i, i)) {
             c.d(p0);
          }
          return view;
       }else {
          a uoa = 7;
          e uoe = 10;
          if (p3.getIndexCount() > 0) {
             e uoe1 = new e(iAttrHost, p3, iAttrHost2, iAttrHost1);
             StateListDrawable stateListDra = new StateListDrawable();
             i1 = 0;
             while (i1 < uoe1.b.getIndexCount()) {
                index = uoe1.b.getIndex(i1);
                if (index == uoe) {
                   uoe1.a(uoe1.a, uoe1.b, stateListDra, index, -16842910);
                }else if(!index){
                   uoe1.a(uoe1.a, uoe1.b, stateListDra, index, 0x101009f);
                }else if(index == 8){
                   uoe1.a(uoe1.a, uoe1.b, stateListDra, index, -16842911);
                }else if(index == 1){
                   uoe1.a(uoe1.a, uoe1.b, stateListDra, index, 0x10100a0);
                }else if(index == 9){
                   uoe1.a(uoe1.a, uoe1.b, stateListDra, index, -16842912);
                }else if(index == uoa){
                   uoe1.a(uoe1.a, uoe1.b, stateListDra, index, 0x10100a1);
                }else if(index == 15){
                   uoe1.a(uoe1.a, uoe1.b, stateListDra, index, -16842913);
                }else if(index == 6){
                   uoe1.a(uoe1.a, uoe1.b, stateListDra, index, 0x10100a7);
                }else if(index == 14){
                   uoe1.a(uoe1.a, uoe1.b, stateListDra, index, -16842919);
                }else if(index == 4){
                   uoe1.a(uoe1.a, uoe1.b, stateListDra, index, 0x101009c);
                }else if(index == 12){
                   uoe1.a(uoe1.a, uoe1.b, stateListDra, index, -16842908);
                }else if(index == 5){
                   uoe1.a(uoe1.a, uoe1.b, stateListDra, index, 0x1010367);
                }else if(index == 13){
                   uoe1.a(uoe1.a, uoe1.b, stateListDra, index, -16843623);
                }else if(index == 3){
                   uoe1.a(uoe1.a, uoe1.b, stateListDra, index, 0x10102fe);
                }else if(index == 11){
                   uoe1.a(uoe1.a, uoe1.b, stateListDra, index, -16843518);
                }else if(index == 2){
                   uoe1.a(uoe1.a, uoe1.b, stateListDra, index, 0x101009e);
                }
                i1 = i1 + 1;
                uoe = 10;
             }
             e.d(stateListDra, view, iAttrHost);
          }else if(p1.getIndexCount() > 0){
             e.d(a.a(iAttrHost, iAttrHost2, iAttrHost1, true), view, iAttrHost);
          }
          if (view instanceof TextView && p5.getIndexCount() > 0) {
             View view1 = view;
             a uoa1 = new a(p5);
             int[][] ointArray = new int[][uoa1.a.getIndexCount()];
             uoa1.b = ointArray;
             int[] ointArray1 = new int[uoa1.a.getIndexCount()];
             uoa1.c = ointArray1;
             int i2 = 0;
             while (i2 < uoa1.a.getIndexCount()) {
                int index1 = uoa1.a.getIndex(i2);
                if (index1 == 2) {
                   uoa1.a(uoa1.a, index1, 0x101009f);
                   index = 11;
                }else if(index1 == 11){
                   uoa1.a(uoa1.a, index1, -16842911);
                }else if(index1 == 3){
                   uoa1.a(uoa1.a, index1, 0x10100a0);
                }else if(index1 == 12){
                   uoa1.a(uoa1.a, index1, -16842912);
                }else if(index1 == 4){
                   uoa1.a(uoa1.a, index1, 0x101009e);
                }else if(index1 == 13){
                   uoa1.a(uoa1.a, index1, -16842910);
                }else if(index1 == 8){
                   uoa1.a(uoa1.a, index1, 0x10100a1);
                }else if(index1 == 17){
                   uoa1.a(uoa1.a, index1, -16842913);
                }else if(index1 == uoa){
                   uoa1.a(uoa1.a, index1, 0x10100a7);
                }else if(index1 == 16){
                   uoa1.a(uoa1.a, index1, -16842919);
                }else if(index1 == 6){
                   uoa1.a(uoa1.a, index1, 0x101009c);
                }else if(index1 == 15){
                   uoa1.a(uoa1.a, index1, -16842908);
                }else if(!index1){
                   uoa1.a(uoa1.a, index1, 0x10102fe);
                }else if(index1 == 9){
                   uoa1.a(uoa1.a, index1, -16842914);
                }else if(index1 == 1){
                   uoa1.a(uoa1.a, index1, 0x10100a2);
                }else if(index1 == 10){
                   uoa1.a(uoa1.a, index1, -16843518);
                }else if(index1 == 5){
                   uoa1.a(uoa1.a, index1, 0x10100a8);
                }else if(index1 == 14){
                   uoa1.a(uoa1.a, index1, -16842920);
                }
                i1 = 10;
                i2 = i2 + 1;
                uoa = 7;
             }
             view1.setTextColor(new ColorStateList(uoa1.b, uoa1.c));
          }
          if (iAttrHost1.getBoolean(0, 0)) {
             c.d(p0);
          }
          return view;
       }
    }
    public static boolean b(int p0,int p1){
       boolean b = ((p0 & p1) == p1)? true: false;
       return b;
    }
    public static View c(Context p0,AttributeSet p1,View p2){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.m6);
       TypedArray typedArray1 = p0.obtainStyledAttributes(p1, c$b.n6);
       TypedArray typedArray2 = p0.obtainStyledAttributes(p1, c$b.o6);
       TypedArray typedArray3 = p0.obtainStyledAttributes(p1, c$b.s6);
       int i = 0;
       int resourceId = typedArray.getResourceId(23, i);
       TypedArray typedArray4 = null;
       TypedArray typedArray5 = (resourceId)? p0.obtainStyledAttributes(p1, c$b.d2, i, resourceId): typedArray4;
       try{
          e.a(p2, new TypeArrayIAttrHostImpl(typedArray), new TypeArrayIAttrHostImpl(typedArray1), new TypeArrayIAttrHostImpl(typedArray2), new TypeArrayIAttrHostImpl(typedArray4), new TypeArrayIAttrHostImpl(typedArray3), new TypeArrayIAttrHostImpl(typedArray5));
          typedArray.recycle();
          typedArray2.recycle();
          typedArray3.recycle();
          if (typedArray5 != null) {
             typedArray5.recycle();
          }
          return p2;
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          typedArray.recycle();
          typedArray2.recycle();
          typedArray3.recycle();
          if (typedArray5) {
             typedArray5.recycle();
          }
          return p2;
       }
    }
    public static void d(Drawable p0,View p1,IAttrHost p2){
       LayerDrawable layerDrawabl1;
       int i = 34;
       if (p2.hasValue(i)) {
          int i1 = 33;
          if (p2.hasValue(i1)) {
             int i2 = 4;
             int i3 = 8;
             float dimension = p2.getDimension(i, 0);
             int intx = p2.getInt(i1, 0);
             float f = (e.b(intx, 2))? dimension: - dimension;
             float f1 = (e.b(intx, i2))? dimension: - dimension;
             float f2 = (e.b(intx, i3))? dimension: - dimension;
             if (!e.b(intx, 16)) {
                dimension = - dimension;
             }
             Drawable[] uDrawableArr = new Drawable[]{p0};
             LayerDrawable layerDrawabl = new LayerDrawable(uDrawableArr);
             layerDrawabl.setLayerInset(0, (int)f, (int)f1, (int)f2, (int)dimension);
             layerDrawabl1 = layerDrawabl;
          }
       }
       p1.setBackground(layerDrawabl1);
       return;
    }
}
