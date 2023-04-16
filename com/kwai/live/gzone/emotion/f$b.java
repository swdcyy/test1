package com.kwai.live.gzone.emotion.f$b;
import y8c.g;
import com.kwai.live.gzone.emotion.f;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.kwai.live.gzone.emotion.i;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import g9c.a;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.View;
import i2b.a;
import com.kwai.live.gzone.emotion.f$a;
import ml8.c;

public class f$b extends g	// class@000cde
{
    public final f w;
    public static final int x;

    public void f$b(f p0){
       this.w = p0;
       super();
    }
    public void W0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "2")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          EmotionInfo uEmotionInfo = iterator.next();
          EmotionInfo mPayType = uEmotionInfo.mPayType;
          if (mPayType > 1 && (uEmotionInfo.mPayStatus == 1 && uEmotionInfo.mPayTime > 0)) {
             uArrayList.add(uEmotionInfo);
          }else if(mPayType > 1){
             uArrayList1.add(uEmotionInfo);
          }
       }
       Collections.sort(uArrayList, i.b);
       uArrayList1.addAll(uArrayList);
       super.W0(uArrayList1);
       return;
    }
    public f h1(ViewGroup p0,int p1){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.a(p0.getContext(), 0x7f0d0bb5), new f$a(this.w));
    }
}
