package pr4.r;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract r implements MessageLiteOrBuilder	// class@002e17
{

    String getBizType();
    ByteString getBizTypeBytes();
    String getDownloadReason();
    ByteString getDownloadReasonBytes();
    String getExpectedSize();
    ByteString getExpectedSizeBytes();
    long getFinishDownloadTime();
    String getIdentifier();
    ByteString getIdentifierBytes();
    String getPreloadReceivedSize();
    ByteString getPreloadReceivedSizeBytes();
    String getQosRank();
    ByteString getQosRankBytes();
    String getReportReason();
    ByteString getReportReasonBytes();
    String getResourceType();
    ByteString getResourceTypeBytes();
    long getStartDownloadTime();
    long getSubmitTime();
    String getUrls();
    ByteString getUrlsBytes();
}
