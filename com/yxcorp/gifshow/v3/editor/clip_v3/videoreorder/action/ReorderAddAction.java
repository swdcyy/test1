package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.action.ReorderAddAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import android.content.Intent;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.io.Serializable;
import ekd.j0;
import java.util.ArrayList;
import yoc.f;
import wba.d;
import java.util.List;

public final class ReorderAddAction extends EditSdkAction	// class@000dfc
{
    public final Intent data;
    public final Map fileAndDraftMap;
    public final int mCurrentPosition;

    public void ReorderAddAction(int p0,Intent p1,Map p2){
       a.p(p2, "fileAndDraftMap");
       super();
       this.mCurrentPosition = p0;
       this.data = p1;
       this.fileAndDraftMap = p2;
    }
    public final Intent getData(){
       return this.data;
    }
    public final int getMCurrentPosition(){
       return this.mCurrentPosition;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReorderAddAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("ReorderAddAction", "onAdd data = "+this.data, objArray);
       ReorderAddAction tdata = this.data;
       if (tdata != null) {
          ArrayList uArrayList = j0.e(tdata, "album_data_list");
          if (uArrayList != null) {
             ReorderAddAction tmCurrentPos = this.mCurrentPosition;
             f.a.k(tmCurrentPos);
             d.a.a(p0, tmCurrentPos, uArrayList, this.fileAndDraftMap);
          }
       }
       return;
    }
}
