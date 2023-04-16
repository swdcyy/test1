package bbd.d;
import java.lang.Runnable;
import bbd.f;
import java.lang.Object;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import x9d.d;
import x9d.e;
import com.google.gson.JsonObject;
import nfd.q1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import java.lang.String;

public final class d implements Runnable	// class@0003d5
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       f q = tb.q;
       SearchItem mKBoxItem = q.mKBoxItem;
       q1.x(1, tb.p, q, mKBoxItem.mBaseFeed, e.b(mKBoxItem).f, null, q1.a(tb.q));
    }
}
