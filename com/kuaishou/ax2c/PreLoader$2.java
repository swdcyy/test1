package com.kuaishou.ax2c.PreLoader$2;
import java.util.concurrent.Callable;
import com.kuaishou.ax2c.PreLoader;
import com.kuaishou.ax2c.PreloadParam;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import android.util.Pair;
import com.kuaishou.ax2c.PreLoader$InflateListener;
import com.kuaishou.ax2c.AX2C;
import com.kuaishou.ax2c.LayoutInflaterDelegate;
import android.view.ViewGroup;
import android.view.View;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Integer;

public class PreLoader$2 implements Callable	// class@000fb9
{
    public final PreLoader this$0;
    public final Context val$context;
    public final int val$layoutId;
    public final PreloadParam val$param;
    public final String val$tag;

    public void PreLoader$2(PreLoader p0,PreloadParam p1,int p2,Context p3,String p4){
       this.this$0 = p0;
       this.val$param = p1;
       this.val$layoutId = p2;
       this.val$context = p3;
       this.val$tag = p4;
       super();
    }
    public Pair call(){
       this.this$0.injectLooper();
       PreloadParam inflateListe = this.val$param.inflateListener;
       if (inflateListe != null) {
          inflateListe.onStart(this.val$layoutId);
       }
       PreLoader$2 tval$param = this.val$param;
       View view = new AX2C(this.val$context, this.this$0.mInflaterDelegate).inflateSync(this.val$layoutId, null, false, tval$param.useAx2c, tval$param.inflateListener);
       PreloadParam inflateListe1 = this.val$param.inflateListener;
       if (inflateListe1 != null) {
          inflateListe1.onFinish(this.val$layoutId, view);
       }
       this.this$0.reduceResMapCount(this.val$layoutId);
       if (!(this.val$tag).equals("")) {
          view.setTag(R.id.ax2c_tag_key, this.val$tag);
       }
       Integer integer = this.this$0.clearLayoutRecord.get(this.val$tag);
       if (this.this$0.clearLayoutRecord.containsKey(this.val$tag) && (view != null && (integer != null && this.val$layoutId == integer.intValue()))) {
          view = null;
          this.this$0.clearLayoutRecord.remove(this.val$tag);
       }
    label_007b :
       return new Pair(this.val$context, view);
    }
    public Object call(){
       return this.call();
    }
}
