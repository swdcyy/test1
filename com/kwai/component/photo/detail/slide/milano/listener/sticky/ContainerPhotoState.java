package com.kwai.component.photo.detail.slide.milano.listener.sticky.ContainerPhotoState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ContainerPhotoState extends Enum	// class@000a61
{
    public final String mName;
    public static final ContainerPhotoState[] $VALUES;
    public static final ContainerPhotoState ATTACHED;
    public static final ContainerPhotoState BECAME_ATTACH;
    public static final ContainerPhotoState NO_PHOTO_ATTACH;

    static {
       ContainerPhotoState uContainerPh1;
       ContainerPhotoState[] uContainerPh = new ContainerPhotoState[]{uContainerPh1,uContainerPh1,uContainerPh1};
       uContainerPh1 = new ContainerPhotoState("NO_PHOTO_ATTACH", 0, "NO_PHOTO_ATTACH");
       ContainerPhotoState.NO_PHOTO_ATTACH = uContainerPh1;
       uContainerPh1 = new ContainerPhotoState("BECAME_ATTACH", 1, "BECAME_ATTACH");
       ContainerPhotoState.BECAME_ATTACH = uContainerPh1;
       uContainerPh1 = new ContainerPhotoState("ATTACHED", 2, "ATTACHED");
       ContainerPhotoState.ATTACHED = uContainerPh1;
       ContainerPhotoState.$VALUES = uContainerPh;
    }
    public void ContainerPhotoState(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static ContainerPhotoState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ContainerPhotoState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ContainerPhotoState.class, p0);
    }
    public static ContainerPhotoState[] values(){
       Object obj = PatchProxy.apply(null, null, ContainerPhotoState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ContainerPhotoState.$VALUES.clone();
    }
    public String toString(){
       return this.mName;
    }
}
