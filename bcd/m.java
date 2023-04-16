package bcd.m;
import iy5.c;
import com.yxcorp.plugin.search.entity.IconEntity;
import java.lang.String;
import com.kwai.feature.component.ColorEntity;

public interface abstract m implements c	// class@0003e9
{

    IconEntity getGuessLabel();
    String getKeyword();
    ColorEntity getKeywordColor();
    String getRecoReason();
    boolean isShowReason();
}
