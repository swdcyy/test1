package com.yxcorp.gifshow.music.utils.CloudMusicViewFactory;
import lnc.a1;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import i2b.a;
import android.content.res.Resources;
import com.yxcorp.gifshow.music.utils.CloudMusicViewFactory$ElementType;
import java.lang.Number;
import com.yxcorp.gifshow.music.utils.CloudMusicViewFactory$a;
import java.lang.Enum;

public class CloudMusicViewFactory	// class@00208a
{
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;

    static {
       CloudMusicViewFactory.a = a1.e(0x3f000000);
       CloudMusicViewFactory.b = a1.e(19.00f);
       CloudMusicViewFactory.c = a1.e(15.00f);
       CloudMusicViewFactory.d = a1.e(12.00f);
    }
    public void CloudMusicViewFactory(){
       super();
    }
    public static View a(ViewGroup p0,int p1){
       CloudMusicViewFactory uCloudMusicV = CloudMusicViewFactory.class;
       if (PatchProxy.isSupport(uCloudMusicV)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uCloudMusicV, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = CloudMusicViewFactory.b(p0, R.layout.arg_RES_7f0d1010, p1);
       view.setBackground(null);
       return view;
    }
    public static View b(ViewGroup p0,int p1,int p2){
       if (PatchProxy.isSupport(CloudMusicViewFactory.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, CloudMusicViewFactory.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return CloudMusicViewFactory.c(p0, p1, p2, null);
    }
    public static View c(ViewGroup p0,int p1,int p2,Drawable p3){
       if (PatchProxy.isSupport(CloudMusicViewFactory.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, null, CloudMusicViewFactory.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = a.i(p0, p1);
       view.setBackground(view.getResources().getDrawable(R.drawable.arg_RES_7f080384));
       CloudMusicViewFactory.f(view);
       return view;
    }
    public static void d(ViewGroup p0,CloudMusicViewFactory$ElementType p1){
       int i;
       CloudMusicViewFactory uCloudMusicV = CloudMusicViewFactory.class;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, uCloudMusicV, "7")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.removeAllViews();
       View obj1 = PatchProxy.applyOneRefs(p1, obj, uCloudMusicV, "11");
       if (obj1 != PatchProxyResult.class) {
          i = obj1.intValue();
       }else {
          switch (CloudMusicViewFactory$a.a[p1.ordinal()]){
              case 1:
                i = 0x7f0d1001;
                break;
              case 2:
                i = 0x7f0d1007;
                break;
              case 3:
                i = 0x7f0d0fff;
                break;
              case 4:
                i = 0x7f0d1003;
                break;
              case 5:
                i = 0x7f0d1005;
                break;
              case 6:
                i = 0x7f0d0ffd;
                break;
              case 7:
                i = 0x7f0d1008;
                break;
              default:
                i = 0;
          }
       }
       obj1 = a.i(p0, i);
       obj1.setTag(0x20181016, p1);
       p0.addView(obj1);
       return;
    }
    public static void e(ViewGroup p0,CloudMusicViewFactory$ElementType p1){
       int i;
       CloudMusicViewFactory uCloudMusicV = CloudMusicViewFactory.class;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, uCloudMusicV, "8")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.removeAllViews();
       View obj1 = PatchProxy.applyOneRefs(p1, obj, uCloudMusicV, "12");
       if (obj1 != PatchProxyResult.class) {
          i = obj1.intValue();
       }else {
          switch (CloudMusicViewFactory$a.a[p1.ordinal()]){
              case 1:
                i = 0x7f0d1000;
                break;
              case 2:
                i = 0x7f0d1006;
                break;
              case 3:
                i = 0x7f0d0ffe;
                break;
              case 4:
                i = 0x7f0d1002;
                break;
              case 5:
                i = 0x7f0d1004;
                break;
              case 6:
                i = 0x7f0d0ffd;
                break;
              case 7:
                i = 0x7f0d1008;
                break;
              default:
                i = 0;
          }
       }
       obj1 = a.i(p0, i);
       obj1.setTag(0x20181016, p1);
       p0.addView(obj1);
       return;
    }
    public static void f(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, CloudMusicViewFactory.class, "6")) {
          return;
       }
       Integer[] integerArray = new Integer[]{Integer.valueOf(0x7f0a3b95),Integer.valueOf(0x7f0a3b96),Integer.valueOf(0x7f0a3b97),Integer.valueOf(0x7f0a3b98)};
       int i = 0;
       while (i < 4) {
          ViewGroup viewGroup = p0.findViewById(integerArray[i].intValue());
          if (viewGroup != null) {
             viewGroup.removeAllViews();
          }
          i = i + 1;
       }
       return;
    }
}
