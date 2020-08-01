// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packages/apps/Dialer/java/com/android/voicemail/impl/transcribe/grpc/voicemail_transcription.proto

package com.google.internal.communications.voicemailtranscription.v1;

public interface TranscribeVoicemailRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.internal.communications.voicemailtranscription.v1.TranscribeVoicemailRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Voicemail audio file containing the raw bytes we receive from the carrier.
   * </pre>
   *
   * <code>optional bytes voicemail_data = 1;</code>
   */
  boolean hasVoicemailData();
  /**
   * <pre>
   * Voicemail audio file containing the raw bytes we receive from the carrier.
   * </pre>
   *
   * <code>optional bytes voicemail_data = 1;</code>
   */
  com.google.protobuf.ByteString getVoicemailData();

  /**
   * <pre>
   * Audio format of the voicemail file.
   * </pre>
   *
   * <code>optional .google.internal.communications.voicemailtranscription.v1.AudioFormat audio_format = 2;</code>
   */
  boolean hasAudioFormat();
  /**
   * <pre>
   * Audio format of the voicemail file.
   * </pre>
   *
   * <code>optional .google.internal.communications.voicemailtranscription.v1.AudioFormat audio_format = 2;</code>
   */
  com.google.internal.communications.voicemailtranscription.v1.AudioFormat getAudioFormat();
}