package com.kuaishou.live.core.show.fansgroup.LiveFansGroupAutoActivePromptDialogInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import lnc.a1;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupAutoActivePromptDialogInfo$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import java.util.ArrayList;
import com.kuaishou.live.core.show.common.LiveColorSpanModel;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class LiveFansGroupAutoActivePromptDialogInfo implements Serializable	// class@000b27
{
    public List b;
    public String mPromptDialogCancelText;
    public String mPromptDialogContent;
    public String mPromptDialogOkText;
    public String mPromptDialogOkTextColor;
    public String mPromptDialogTitle;
    public static final long serialVersionUID = 0x8ab4402cea67ccae;

    public void LiveFansGroupAutoActivePromptDialogInfo(){
       super();
       this.mPromptDialogOkTextColor = a1.p(0x7f061d91);
    }
    public List getContentColorSpanModelList(){
       LiveColorSpanModel obj = PatchProxy.apply(null, this, LiveFansGroupAutoActivePromptDialogInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          if (this.mPromptDialogContent == null) {
             this.mPromptDialogContent = "";
          }
          try{
             this.b = a.a.i(this.mPromptDialogContent, new LiveFansGroupAutoActivePromptDialogInfo$1(this).getType());
          }catch(java.lang.Exception e0){
             this.b = new ArrayList();
             obj = new LiveColorSpanModel();
             obj.mColor = a1.p(0x7f061d77);
             obj.mText = a1.p(0x7f102131);
             this.b.add(obj);
             b.c0(LiveLogTag.FANS_GROUP, "content color span error", "content", this.mPromptDialogContent);
          }
       }
    }
}
