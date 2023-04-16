package cja.a;
import java.lang.Object;
import r26.a;
import com.kwai.kcube.TabIdentifier;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import on5.b;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import r26.b;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest;

public final class a	// class@000524
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final TabIdentifier a(a p0){
       TabIdentifier mockFeedUplo;
       TabIdentifier obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "postWorkInfo");
       obj = b.c;
       if (p0.getUploadInfo() != null) {
          IUploadInfo uploadInfo = p0.getUploadInfo();
          a.o(uploadInfo, "postWorkInfo.uploadInfo");
          mockFeedUplo = uploadInfo.getMockFeedUploadTarget();
       }else if(p0.getRequest() != null){
          b request = p0.getRequest();
          a.o(request, "postWorkInfo.request");
          if (request.a() != null) {
             b request1 = p0.getRequest();
             a.o(request1, "postWorkInfo.request");
             IUploadRequest iUploadReque = request1.a();
             a.o(iUploadReque, "postWorkInfo.request.uploadRequest");
             mockFeedUplo = iUploadReque.getMockFeedUploadTarget();
          }
       }
       mockFeedUplo = obj;
       if (mockFeedUplo != null) {
          obj = mockFeedUplo;
       }else {
          a.o(obj, "HomeTabIdentifier.FOLLOW");
       }
       return obj;
    }
}
