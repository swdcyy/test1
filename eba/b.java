package eba.b;
import laa.e;
import java.io.File;
import com.kuaishou.edit.draft.Sticker;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Sticker$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.StickerResult$b;
import com.kuaishou.edit.draft.StickerResult;
import java.lang.System;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.List;
import java.util.ArrayList;
import com.kuaishou.edit.draft.RelayStickerParam;
import java.util.Iterator;
import com.kuaishou.edit.draft.Friend;

public class b extends e	// class@0020ff
{

    public void b(File p0,Sticker p1,c p2){
       super(p0, p1, p2);
    }
    public GeneratedMessageLite d(){
       Sticker sticker = PatchProxy.apply(null, this, b.class, "1");
       if (sticker != PatchProxyResult.class) {
       }else {
          Sticker$b uob = Sticker.newBuilder();
          uob.d(DraftUtils.i());
          StickerResult$b uob1 = StickerResult.newBuilder();
          uob1.w((int)(System.currentTimeMillis() / 1000));
          uob.i(uob1.build());
          sticker = uob.build();
       }
       return sticker;
    }
    public List j(GeneratedMessageLite p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          if (p0.hasResult()) {
             uArrayList.add(p0.getResult().getPreviewImageFile());
             uArrayList.add(p0.getResult().getOutputImageFile());
          }
          if (p0.hasRelayStickerParam()) {
             Iterator iterator = p0.getRelayStickerParam().getFriendsList().iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().getFile());
             }
             Iterator iterator1 = p0.getRelayStickerParam().getFromPhotoFriendsList().iterator();
             while (iterator1.hasNext()) {
                uArrayList.add(iterator1.next().getFile());
             }
          }
       }
       return uArrayList;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.f().d(DraftUtils.m0(this.f().instance.getAttributes()));
       return;
    }
}
