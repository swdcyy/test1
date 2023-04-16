package com.yxcorp.gifshow.v3.editor.item.FrameEditIcon;
import com.yxcorp.gifshow.v3.editor.item.EditIcon;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import ooc.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.Preview;
import com.yxcorp.gifshow.v3.editor.item.PostBaseIcon;

public class FrameEditIcon extends EditIcon	// class@000fb2
{
    public static final long serialVersionUID = 0x7ea22ac247438167;

    public void FrameEditIcon(EditorItemFunc p0,int p1,int p2){
       super(p0, p1, p2);
    }
    public int getOriginIconId(){
       Object obj = PatchProxy.apply(null, this, FrameEditIcon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.mEditorDelegate.N() == null || this.mEditorDelegate.N().v() == null) {
          return super.getOriginIconId();
       }
       int frameType = this.mEditorDelegate.N().v().getPreview().getFrameType();
       if (frameType == 1) {
          return super.getOriginIconId();
       }
       if (frameType == 2) {
          return this.getStatusIconByKey("ICON_FRAME_NINE_TO_SIXTEEN");
       }
       if (frameType == 3) {
          return this.getStatusIconByKey("ICON_FRAME_THREE_TO_FOUR");
       }
       if (frameType == 4) {
          return this.getStatusIconByKey("ICON_FRAME_ONE_TO_ONE");
       }
       if (frameType == 5) {
          return this.getStatusIconByKey("ICON_FRAME_FOUR_TO_THREE");
       }
       if (frameType != 7) {
          return super.getOriginIconId();
       }
       return this.getStatusIconByKey("ICON_FRAME_FULL_SCREEN");
    }
}
