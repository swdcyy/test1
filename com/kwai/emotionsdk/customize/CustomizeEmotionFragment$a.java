package com.kwai.emotionsdk.customize.CustomizeEmotionFragment$a;
import erd.g;
import com.kwai.emotionsdk.customize.CustomizeEmotionFragment;
import java.lang.Object;
import com.kwai.emotionsdk.bean.EmotionPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.emotionsdk.bean.EmotionInfo;
import gk5.h;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import jl5.c;
import java.lang.CharSequence;
import android.widget.TextView;

public class CustomizeEmotionFragment$a implements g	// class@000d9f
{
    public final CustomizeEmotionFragment b;

    public void CustomizeEmotionFragment$a(CustomizeEmotionFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomizeEmotionFragment$a.class, "1")) {
       }else {
          ArrayList uArrayList = new ArrayList();
          if (!q.f(p0.getMEmotions())) {
             p0 = p0.getMEmotions().iterator();
             while (p0.hasNext()) {
                EmotionInfo uEmotionInfo = p0.next();
                if (uEmotionInfo.mType == 5) {
                   continue ;
                }
                uArrayList.add(uEmotionInfo);
             }
          }
          int i = uArrayList.size();
          CustomizeEmotionFragment$a tb = this.b;
          CustomizeEmotionFragment j = tb.j;
          if (j == null) {
             tb.j = new h(uArrayList, tb);
             CustomizeEmotionFragment$a tb1 = this.b;
             tb1.f.setAdapter(tb1.j);
             this.b.j.k0();
          }else {
             j.O0(uArrayList);
             CustomizeEmotionFragment j1 = this.b.j;
             Objects.requireNonNull(j1);
             if (!PatchProxy.applyVoid(null, j1, h.class, "6")) {
                j1.g.clear();
             }
             this.b.j.k0();
          }
          this.b.e.setText(c.h(R.string.arg_RES_7f100d7f, String.valueOf(i)));
       }
       return;
    }
}
