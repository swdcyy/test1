package hr4.k;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$WordDetail;
import java.util.List;

public interface abstract k implements MessageLiteOrBuilder	// class@0023c3
{

    float getEndTime();
    String getFixedResult();
    ByteString getFixedResultBytes();
    float getStartTime();
    StentorMMU$WordDetail getWords(int p0);
    int getWordsCount();
    List getWordsList();
}
