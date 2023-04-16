package com.facebook.react.views.image.ReactImageView$LastResizeViewState$ExceptionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ReactImageView$LastResizeViewState$ExceptionType extends Enum	// class@0013bb
{
    public static final ReactImageView$LastResizeViewState$ExceptionType[] $VALUES;
    public static final ReactImageView$LastResizeViewState$ExceptionType INVALID_VIEW_SIZE;
    public static final ReactImageView$LastResizeViewState$ExceptionType SCALE_TYPE;
    public static final ReactImageView$LastResizeViewState$ExceptionType SIZE_CHANGED;
    public static final ReactImageView$LastResizeViewState$ExceptionType SOURCE_CHANGED;

    static {
       ReactImageView$LastResizeViewState$ExceptionType lastResizeVi = new ReactImageView$LastResizeViewState$ExceptionType("INVALID_VIEW_SIZE", 0);
       ReactImageView$LastResizeViewState$ExceptionType.INVALID_VIEW_SIZE = lastResizeVi;
       ReactImageView$LastResizeViewState$ExceptionType lastResizeVi1 = new ReactImageView$LastResizeViewState$ExceptionType("SCALE_TYPE", 1);
       ReactImageView$LastResizeViewState$ExceptionType.SCALE_TYPE = lastResizeVi1;
       ReactImageView$LastResizeViewState$ExceptionType lastResizeVi2 = new ReactImageView$LastResizeViewState$ExceptionType("SOURCE_CHANGED", 2);
       ReactImageView$LastResizeViewState$ExceptionType.SOURCE_CHANGED = lastResizeVi2;
       ReactImageView$LastResizeViewState$ExceptionType lastResizeVi3 = new ReactImageView$LastResizeViewState$ExceptionType("SIZE_CHANGED", 3);
       ReactImageView$LastResizeViewState$ExceptionType.SIZE_CHANGED = lastResizeVi3;
       ReactImageView$LastResizeViewState$ExceptionType[] lastResizeVi4 = new ReactImageView$LastResizeViewState$ExceptionType[]{lastResizeVi,lastResizeVi1,lastResizeVi2,lastResizeVi3};
       ReactImageView$LastResizeViewState$ExceptionType.$VALUES = lastResizeVi4;
    }
    public void ReactImageView$LastResizeViewState$ExceptionType(String p0,int p1){
       super(p0, p1);
    }
    public static ReactImageView$LastResizeViewState$ExceptionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ReactImageView$LastResizeViewState$ExceptionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ReactImageView$LastResizeViewState$ExceptionType.class, p0);
    }
    public static ReactImageView$LastResizeViewState$ExceptionType[] values(){
       Object obj = PatchProxy.apply(null, null, ReactImageView$LastResizeViewState$ExceptionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReactImageView$LastResizeViewState$ExceptionType.$VALUES.clone();
    }
}
