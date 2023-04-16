package com.kwai.video.minecraft.model.ClipModel;
import com.kwai.video.minecraft.model.ComposableModel;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.MutableClip;
import com.kwai.video.minecraft.model.TimeRange;
import java.lang.String;
import com.kwai.video.minecraft.model.RationalTime;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.MediaReferenceModel;

public interface abstract ClipModel implements ComposableModel	// class@0009e9
{

    MutableClip cloneClip(ErrorStatus p0);
    TimeRange getAvailableRange(ErrorStatus p0);
    String getClipId(ErrorStatus p0);
    RationalTime getDuration(ErrorStatus p0);
    ImmutableArray getEffects(ErrorStatus p0);
    MediaReferenceModel getMediaReference(ErrorStatus p0);
    TimeRange getSourceRange(ErrorStatus p0);
    TimeRange getTrimmedRange(ErrorStatus p0);
}
