package com.kuaishou.merchant.live.cart.salemanager.model.LiveAnchorToolsInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import java.lang.Integer;
import java.util.List;
import android.text.style.ForegroundColorSpan;
import lnc.a1;
import java.lang.Number;
import com.kuaishou.merchant.live.cart.salemanager.model.LiveAnchorToolsInfo$a;
import java.lang.reflect.Type;
import el.a;
import java.util.HashSet;
import aa0.a;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.live.cart.salemanager.model.LiveAnchorToolsInfo$LiveAnchorTool;
import java.lang.Boolean;

public class LiveAnchorToolsInfo implements Serializable	// class@0019ef
{
    public String mIcon;
    public boolean mIsPermanent;
    public List mLiveAnchorToolList;
    public String mTitle;
    public static final long serialVersionUID = 0xa44a7e633b1143b0;

    public void LiveAnchorToolsInfo(){
       super();
    }
    public LiveAnchorToolsInfo getOnSellToolAreaInfo(){
       LiveAnchorToolsInfo obj = PatchProxy.apply(null, this, LiveAnchorToolsInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveAnchorToolsInfo();
       obj.mTitle = this.mTitle;
       obj.mLiveAnchorToolList = this.mLiveAnchorToolList;
       return obj;
    }
    public SpannableStringBuilder getShowTitle(){
       SpannableStringBuilder obj = PatchProxy.apply(null, this, LiveAnchorToolsInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SpannableStringBuilder();
       obj.append(this.mTitle);
       obj.append(Integer.toString(this.getUsedToolsCount()));
       obj.append("/");
       LiveAnchorToolsInfo tmLiveAnchor = this.mLiveAnchorToolList;
       int i = (tmLiveAnchor != null)? tmLiveAnchor.size(): 0;
       obj.append(Integer.toString(i));
       obj.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f061dfb)), (obj.length() - 3), obj.length(), 18);
       return obj;
    }
    public int getUsedToolsCount(){
       HashSet obj = PatchProxy.apply(null, this, LiveAnchorToolsInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.c(new LiveAnchorToolsInfo$a(this).getType());
       int i = 0;
       if (q.f(obj) || q.f(this.mLiveAnchorToolList)) {
          return i;
       }
       int i1 = 0;
       while (i < this.mLiveAnchorToolList.size()) {
          if (obj.contains(Integer.valueOf(this.mLiveAnchorToolList.get(i).mType))) {
             i1 = i1 + 1;
          }
          i = i + 1;
       }
       return i1;
    }
    public boolean isAllUsed(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorToolsInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (q.f(this.mLiveAnchorToolList) || this.getUsedToolsCount() >= this.mLiveAnchorToolList.size())? true: false;
       return b;
    }
}
