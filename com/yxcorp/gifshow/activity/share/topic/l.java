package com.yxcorp.gifshow.activity.share.topic.l;
import y8c.g;
import com.yxcorp.gifshow.activity.share.topic.l$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import java.util.List;
import com.yxcorp.gifshow.model.topic.HistoryItem;
import android.view.ViewGroup;
import y8c.f;
import com.yxcorp.gifshow.model.topic.TopicItemType;
import com.yxcorp.gifshow.activity.share.topic.l$b;
import android.view.View;
import i2b.a;
import ml8.c;

public class l extends g	// class@001487
{
    public l$a w;

    public void l(l$a p0){
       super();
       this.w = p0;
    }
    public int f0(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ol, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.e.get(p0).getItemType();
    }
    public f h1(ViewGroup p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ol, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p1 = (p1 == TopicItemType.SEARCH_RESULT_TIPS.getValue())? 0x7f0d095d: 0x7f0d1501;
       return new f(a.i(p0, p1), new l$b(this));
    }
}
