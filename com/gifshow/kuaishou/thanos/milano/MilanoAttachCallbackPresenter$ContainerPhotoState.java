package com.gifshow.kuaishou.thanos.milano.MilanoAttachCallbackPresenter$ContainerPhotoState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MilanoAttachCallbackPresenter$ContainerPhotoState extends Enum	// class@0015d1
{
    public final String mName;
    public static final MilanoAttachCallbackPresenter$ContainerPhotoState[] $VALUES;
    public static final MilanoAttachCallbackPresenter$ContainerPhotoState ATTACHED;
    public static final MilanoAttachCallbackPresenter$ContainerPhotoState BECAME_ATTACH;
    public static final MilanoAttachCallbackPresenter$ContainerPhotoState NO_PHOTO_ATTACH;

    static {
       MilanoAttachCallbackPresenter$ContainerPhotoState uContainerPh = new MilanoAttachCallbackPresenter$ContainerPhotoState("NO_PHOTO_ATTACH", 0, "NO_PHOTO_ATTACH");
       MilanoAttachCallbackPresenter$ContainerPhotoState.NO_PHOTO_ATTACH = uContainerPh;
       MilanoAttachCallbackPresenter$ContainerPhotoState uContainerPh1 = new MilanoAttachCallbackPresenter$ContainerPhotoState("BECAME_ATTACH", 1, "BECAME_ATTACH");
       MilanoAttachCallbackPresenter$ContainerPhotoState.BECAME_ATTACH = uContainerPh1;
       MilanoAttachCallbackPresenter$ContainerPhotoState uContainerPh2 = new MilanoAttachCallbackPresenter$ContainerPhotoState("ATTACHED", 2, "ATTACHED");
       MilanoAttachCallbackPresenter$ContainerPhotoState.ATTACHED = uContainerPh2;
       MilanoAttachCallbackPresenter$ContainerPhotoState[] uContainerPh3 = new MilanoAttachCallbackPresenter$ContainerPhotoState[]{uContainerPh,uContainerPh1,uContainerPh2};
       MilanoAttachCallbackPresenter$ContainerPhotoState.$VALUES = uContainerPh3;
    }
    public void MilanoAttachCallbackPresenter$ContainerPhotoState(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static MilanoAttachCallbackPresenter$ContainerPhotoState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MilanoAttachCallbackPresenter$ContainerPhotoState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MilanoAttachCallbackPresenter$ContainerPhotoState.class, p0);
    }
    public static MilanoAttachCallbackPresenter$ContainerPhotoState[] values(){
       Object obj = PatchProxy.apply(null, null, MilanoAttachCallbackPresenter$ContainerPhotoState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MilanoAttachCallbackPresenter$ContainerPhotoState.$VALUES.clone();
    }
    public String toString(){
       return this.mName;
    }
}
