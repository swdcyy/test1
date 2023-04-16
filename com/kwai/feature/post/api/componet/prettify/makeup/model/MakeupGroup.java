package com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupGroup;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.yxcorp.gifshow.model.SimpleMagicFace;

public class MakeupGroup implements Serializable	// class@0012f7
{
    public boolean b;
    public int mGroupId;
    public String mGroupName;
    public List mMakeupSuites;
    public static final long serialVersionUID = 0x5b32c3f49627792;

    public void MakeupGroup(){
       super();
       this.b = false;
    }
    public List getMakeupSuites(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, MakeupGroup.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mMakeupSuites != null && (this.mGroupId == -1 || p0 == null)) {
          return null;
       }
       obj = new ArrayList();
       Iterator iterator = this.mMakeupSuites.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Iterator iterator1 = p0.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                MakeupSuite makeupSuite = iterator1.next();
                if (str.equals(makeupSuite.mId)) {
                   obj.add(makeupSuite);
                   if (this.b == null) {
                      makeupSuite.setGroupId(this.mGroupId);
                      makeupSuite.setGroupName(this.mGroupName);
                   }else {
                      continue ;
                   }
                }
             }else {
                continue ;
             }
          }
          this.b = true;
          return obj;
       }
    }
}
