package com.yxcorp.image.request.cdntransform.IImageCDNTransformer$CDNResizeMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IImageCDNTransformer$CDNResizeMode extends Enum	// class@001a24
{
    public static final IImageCDNTransformer$CDNResizeMode[] $VALUES;
    public static final IImageCDNTransformer$CDNResizeMode FILL;
    public static final IImageCDNTransformer$CDNResizeMode FIXED;
    public static final IImageCDNTransformer$CDNResizeMode LFIT;
    public static final IImageCDNTransformer$CDNResizeMode MFIT;
    public static final IImageCDNTransformer$CDNResizeMode NONE;
    public static final IImageCDNTransformer$CDNResizeMode PAD;

    static {
       IImageCDNTransformer$CDNResizeMode uCDNResizeMo = new IImageCDNTransformer$CDNResizeMode("NONE", 0);
       IImageCDNTransformer$CDNResizeMode.NONE = uCDNResizeMo;
       IImageCDNTransformer$CDNResizeMode uCDNResizeMo1 = new IImageCDNTransformer$CDNResizeMode("LFIT", 1);
       IImageCDNTransformer$CDNResizeMode.LFIT = uCDNResizeMo1;
       IImageCDNTransformer$CDNResizeMode uCDNResizeMo2 = new IImageCDNTransformer$CDNResizeMode("MFIT", 2);
       IImageCDNTransformer$CDNResizeMode.MFIT = uCDNResizeMo2;
       IImageCDNTransformer$CDNResizeMode uCDNResizeMo3 = new IImageCDNTransformer$CDNResizeMode("FILL", 3);
       IImageCDNTransformer$CDNResizeMode.FILL = uCDNResizeMo3;
       IImageCDNTransformer$CDNResizeMode uCDNResizeMo4 = new IImageCDNTransformer$CDNResizeMode("PAD", 4);
       IImageCDNTransformer$CDNResizeMode.PAD = uCDNResizeMo4;
       IImageCDNTransformer$CDNResizeMode uCDNResizeMo5 = new IImageCDNTransformer$CDNResizeMode("FIXED", 5);
       IImageCDNTransformer$CDNResizeMode.FIXED = uCDNResizeMo5;
       IImageCDNTransformer$CDNResizeMode[] uCDNResizeMo6 = new IImageCDNTransformer$CDNResizeMode[]{uCDNResizeMo,uCDNResizeMo1,uCDNResizeMo2,uCDNResizeMo3,uCDNResizeMo4,uCDNResizeMo5};
       IImageCDNTransformer$CDNResizeMode.$VALUES = uCDNResizeMo6;
    }
    public void IImageCDNTransformer$CDNResizeMode(String p0,int p1){
       super(p0, p1);
    }
    public static IImageCDNTransformer$CDNResizeMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IImageCDNTransformer$CDNResizeMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(IImageCDNTransformer$CDNResizeMode.class, p0);
    }
    public static IImageCDNTransformer$CDNResizeMode[] values(){
       Object obj = PatchProxy.apply(null, null, IImageCDNTransformer$CDNResizeMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IImageCDNTransformer$CDNResizeMode.$VALUES.clone();
    }
}
