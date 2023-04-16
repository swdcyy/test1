package com.yxcorp.gifshow.model.PassThroughParams;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.PassThroughParams$PresetPartId;
import u3b.a;
import java.lang.Throwable;
import q87.c;

public class PassThroughParams implements Serializable, Cloneable	// class@001e6c
{
    public boolean mAutoDownload;
    public String mFilterIdForMakeup;
    public String mFilterIntensityForMakeup;
    public float mIntensity;
    public boolean mIsDefault;
    public int mLegacyFilterId;
    public String mMd5Code;
    public List mPresetPartIds;
    public List mPreviewScales;
    public int mPriority;
    public List mYModels;
    public static final long serialVersionUID = 0x702fda258e5486bd;

    public void PassThroughParams(){
       super();
    }
    public PassThroughParams clone(){
       PassThroughParams obj = PatchProxy.apply(null, this, PassThroughParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          if (this.mPresetPartIds != null) {
             obj.mPresetPartIds = new ArrayList();
             Iterator iterator = this.mPresetPartIds.iterator();
             while (iterator.hasNext()) {
                obj.mPresetPartIds.add(iterator.next().clone());
             }
          }
          return obj;
       }catch(java.lang.CloneNotSupportedException e0){
          Object[] objArray = new Object[0];
          a.C().u("PassThroughParams", e0, objArray);
          return null;
       }
    }
    public Object clone(){
       return this.clone();
    }
}
