package com.yxcrop.gifshow.v3.editor.sticker_v2.record.RecordVoteStickerDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawerData;
import umd.b;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditVoteStickerDrawer$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kmd.a;

public class RecordVoteStickerDrawer extends NewVoteStickerDrawer	// class@000a94
{
    public static final int f;

    public void RecordVoteStickerDrawer(NewVoteStickerDrawerData p0,b p1,float p2){
       super(p0, p1, p2);
    }
    public EditVoteStickerDrawer$b getQuestionViewLineSizeListener(){
       Object obj = PatchProxy.apply(null, this, RecordVoteStickerDrawer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this);
    }
    public void unSelect(){
       if (PatchProxy.applyVoid(null, this, RecordVoteStickerDrawer.class, "1")) {
          return;
       }
       this.hideTextCursors();
       this.clearAllFocus();
       return;
    }
}
