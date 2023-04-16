package com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGiftBatchConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.util.SparseArray;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;

public class LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem implements Serializable	// class@00112f
{
    public int mGiftBatchCount;
    public String mGiftBatchCountDescription;
    public String mGiftBatchDisplayText;
    public boolean mIsFromAllItem;
    public String mLabel;
    public static final long serialVersionUID = 0x603b7f8dbce6074e;

    public void LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem(int p0,String p1){
       super();
       this.mGiftBatchCount = p0;
       this.mGiftBatchDisplayText = String.valueOf(p0);
       this.mGiftBatchCountDescription = p1;
    }
    public void LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem(int p0,String p1,String p2,boolean p3){
       super();
       this.mGiftBatchCount = p0;
       this.mGiftBatchDisplayText = p1;
       this.mGiftBatchCountDescription = p2;
       this.mIsFromAllItem = p3;
    }
    public static LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem parseFromLiveGiftBatchConfig(LiveConfigStartupResponse$LiveGiftBatchConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem(p0.mGiftBatchCount, p0.mGiftBatchCountDescription);
    }
    public LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem bindLabel(SparseArray p0){
       LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem obj = PatchProxy.applyOneRefs(p0, this, LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = this.mGiftBatchCount;
          if (obj > 1 && !TextUtils.x(p0.get(obj, null))) {
             this.mLabel = p0.get(this.mGiftBatchCount, null);
          }
       }
       return this;
    }
    public boolean isGiftBatchNumberItemInvalid(){
       Object obj = PatchProxy.apply(null, this, LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.x(this.mGiftBatchCountDescription) && TextUtils.x(this.mGiftBatchDisplayText))? true: false;
       return b;
    }
}
