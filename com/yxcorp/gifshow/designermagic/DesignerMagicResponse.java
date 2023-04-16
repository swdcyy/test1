package com.yxcorp.gifshow.designermagic.DesignerMagicResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import java.lang.Long;
import qw9.a;
import com.yxcorp.gifshow.designermagic.DesignerMagicResponse$a;
import java.lang.Boolean;
import la6.a;

public class DesignerMagicResponse implements CursorResponse	// class@001325
{
    public String mCursor;
    public Map mExtParamsMap;
    public List mMagics;
    public Map mUseCounts;

    public void DesignerMagicResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, DesignerMagicResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mMagics == null) {
          return objArray;
       }
       obj = new ArrayList(this.mMagics.size());
       int i = 0;
       while (i < this.mMagics.size()) {
          SimpleMagicFace simpleMagicF = this.mMagics.get(i);
          if (simpleMagicF != null && !TextUtils.x(simpleMagicF.mId)) {
             DesignerMagicResponse tmUseCounts = this.mUseCounts;
             long l = 0;
             long l1 = (tmUseCounts == null)? l: tmUseCounts.get(simpleMagicF.mId).longValue();
             Long longx = Long.valueOf(l1);
             if (longx == null) {
                longx = Long.valueOf(l);
             }
             a uoa = new a();
             int i1 = i + 1;
             uoa.d = i1;
             uoa.a = simpleMagicF;
             uoa.b = longx.longValue();
             tmUseCounts = this.mExtParamsMap;
             if (tmUseCounts != null && tmUseCounts.get(simpleMagicF.mId) != null) {
                uoa.c = this.mExtParamsMap.get(simpleMagicF.mId).mCoverUrls;
             }
             obj.add(uoa);
          }
          i = i + 1;
       }
       return obj;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, DesignerMagicResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
