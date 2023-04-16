package com.kwai.video.stannis.Stannis$KWStannisAudioEffectParam;
import java.lang.Object;

public class Stannis$KWStannisAudioEffectParam	// class@000bda
{
    public int KWAutoTuneScale;
    public int KWAutoTuneTonic;
    public float KWCompressorAttackMs;
    public float KWCompressorGain;
    public float KWCompressorKneeWidth;
    public float KWCompressorRatio;
    public float KWCompressorReleaseMs;
    public float KWCompressorThreshold;
    public float KWDeesserRatio;
    public float KWDeesserThreshold;
    public float KWDryLevel;
    public float KWEarlyLevel;
    public int KWEchoBeatsPerMeasure;
    public int KWEchoBpm;
    public float KWEchoFeedbackDecay;
    public int KWEchoPingpong;
    public float KWEchoWetDecay;
    public float KWEchoWetGain;
    public int KWEnableAutoMix;
    public int KWEnableAutoTune;
    public int KWEnableDeesser;
    public int KWEnableEcho;
    public int KWEnableEnsemble;
    public int KWEnableHarmony;
    public int KWEnableReverb;
    public int KWEnableSaturation;
    public float[] KWEnsembleDelayTime;
    public int[] KWEnsembleLfofreq;
    public float[] KWEnsembleRatio;
    public float[] KWEnsembleWidth;
    public float[] KWEqualizerGain;
    public float[] KWEqualizerSendTrackGain;
    public boolean KWHarmonyIsChorus;
    public byte[] KWHarmonyMidi;
    public int KWHarmonyMode;
    public float KWHarmonyRatio;
    public int KWHarmonyTimbre;
    public int KWHarmonyTonality;
    public float KWMainTrackGain;
    public float KWPreDelay;
    public float KWReverbDamping;
    public float KWReverbInputBandWidth;
    public float KWReverbSpace;
    public float KWReverbTime;
    public float KWSaturationDriveLevel;
    public float[] KWSaturationEqualizerHcGain;
    public float[] KWSaturationEqualizerLhcGain;
    public float KWSendTrackGain;
    public float KWTaiLevel;
    public int midi_length;

    public void Stannis$KWStannisAudioEffectParam(){
       super();
       float[] uofloatArray = new float[10];
       this.KWEqualizerGain = uofloatArray;
       uofloatArray = new float[10];
       this.KWEqualizerSendTrackGain = uofloatArray;
       byte[] uobyteArray = new byte[0x2710];
       this.KWHarmonyMidi = uobyteArray;
       uofloatArray = new float[3];
       this.KWEnsembleRatio = uofloatArray;
       float[] uofloatArray1 = new float[4];
       this.KWEnsembleDelayTime = uofloatArray1;
       uofloatArray1 = new float[4];
       this.KWEnsembleWidth = uofloatArray1;
       int[] ointArray = new int[4];
       this.KWEnsembleLfofreq = ointArray;
       uofloatArray = new float[10];
       this.KWSaturationEqualizerLhcGain = uofloatArray;
       float[] uofloatArray2 = new float[10];
       this.KWSaturationEqualizerHcGain = uofloatArray2;
       this.midi_length = 0;
    }
}
