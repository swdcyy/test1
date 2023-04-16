package com.kuaishou.android.model.mix.ShareToFollowModel;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.List;
import com.kwai.framework.model.user.User;

public class ShareToFollowModel implements Serializable	// class@000dfb
{
    public int mCount;
    public List mSharers;
    public static final long serialVersionUID = 0xf46bd93f5a844a4f;

    public void ShareToFollowModel(){
       super();
       this.mSharers = new ArrayList();
    }
    public String getSharerUserIds(){
       StringBuilder obj = PatchProxy.apply(null, this, ShareToFollowModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       ShareToFollowModel tmSharers = this.mSharers;
       if (tmSharers != null) {
          int i = 1;
          Iterator iterator = tmSharers.iterator();
          while (iterator.hasNext()) {
             User user = iterator.next();
             if (!i) {
                obj = obj+',';
             }else {
                i = 0;
             }
             obj = obj+user.getId();
          }
       }
       return obj;
    }
}
