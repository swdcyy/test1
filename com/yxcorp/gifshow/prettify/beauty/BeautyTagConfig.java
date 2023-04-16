package com.yxcorp.gifshow.prettify.beauty.BeautyTagConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class BeautyTagConfig implements Serializable	// class@0010f1
{
    public List itemEditList;
    public List itemLiveList;
    public List itemRecordList;

    public void BeautyTagConfig(){
       super();
       this.itemRecordList = new ArrayList();
       this.itemEditList = new ArrayList();
       this.itemLiveList = new ArrayList();
    }
    public final List getItemEditList(){
       return this.itemEditList;
    }
    public final List getItemLiveList(){
       return this.itemLiveList;
    }
    public final List getItemRecordList(){
       return this.itemRecordList;
    }
    public final void setItemEditList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyTagConfig.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.itemEditList = p0;
       return;
    }
    public final void setItemLiveList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyTagConfig.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.itemLiveList = p0;
       return;
    }
    public final void setItemRecordList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyTagConfig.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.itemRecordList = p0;
       return;
    }
}
