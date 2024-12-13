// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package com.daigham.EtudeDeCas.stub;

public final class ReservationOuterClass {
  private ReservationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_chalabi_EtudeDeCas_Client_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_chalabi_EtudeDeCas_Client_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_chalabi_EtudeDeCas_Chambre_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_chalabi_EtudeDeCas_Chambre_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_chalabi_EtudeDeCas_Reservation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_chalabi_EtudeDeCas_Reservation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_chalabi_EtudeDeCas_ReservationList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_chalabi_EtudeDeCas_ReservationList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_chalabi_EtudeDeCas_GetReservationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_chalabi_EtudeDeCas_GetReservationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_chalabi_EtudeDeCas_DeleteReservationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_chalabi_EtudeDeCas_DeleteReservationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_chalabi_EtudeDeCas_UpdateReservationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_chalabi_EtudeDeCas_UpdateReservationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_chalabi_EtudeDeCas_DeleteReservationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_chalabi_EtudeDeCas_DeleteReservationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_chalabi_EtudeDeCas_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_chalabi_EtudeDeCas_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021reservation.proto\022\026com.chalabi.EtudeDe" +
      "Cas\"S\n\006Client\022\n\n\002id\030\001 \001(\003\022\013\n\003nom\030\002 \001(\t\022\016" +
      "\n\006prenom\030\003 \001(\t\022\r\n\005email\030\004 \001(\t\022\021\n\ttelepho" +
      "ne\030\005 \001(\t\"E\n\007Chambre\022\n\n\002id\030\001 \001(\003\022\014\n\004type\030" +
      "\002 \001(\t\022\014\n\004prix\030\003 \001(\001\022\022\n\ndisponible\030\004 \001(\010\"" +
      "\264\001\n\013Reservation\022\n\n\002id\030\001 \001(\003\022.\n\006client\030\002 " +
      "\001(\0132\036.com.chalabi.EtudeDeCas.Client\0220\n\007c" +
      "hambre\030\003 \001(\0132\037.com.chalabi.EtudeDeCas.Ch" +
      "ambre\022\021\n\tdateDebut\030\004 \001(\t\022\017\n\007dateFin\030\005 \001(" +
      "\t\022\023\n\013preferences\030\006 \001(\t\"L\n\017ReservationLis" +
      "t\0229\n\014reservations\030\001 \003(\0132#.com.chalabi.Et" +
      "udeDeCas.Reservation\"#\n\025GetReservationRe" +
      "quest\022\n\n\002id\030\001 \001(\003\"&\n\030DeleteReservationRe" +
      "quest\022\n\n\002id\030\001 \001(\003\"`\n\030UpdateReservationRe" +
      "quest\022\n\n\002id\030\001 \001(\003\0228\n\013reservation\030\002 \001(\0132#" +
      ".com.chalabi.EtudeDeCas.Reservation\",\n\031D" +
      "eleteReservationResponse\022\017\n\007message\030\001 \001(" +
      "\t\"\007\n\005Empty2\237\004\n\022ReservationService\022]\n\021Cre" +
      "ateReservation\022#.com.chalabi.EtudeDeCas." +
      "Reservation\032#.com.chalabi.EtudeDeCas.Res" +
      "ervation\022h\n\022GetReservationById\022-.com.cha" +
      "labi.EtudeDeCas.GetReservationRequest\032#." +
      "com.chalabi.EtudeDeCas.Reservation\022Z\n\020Li" +
      "stReservations\022\035.com.chalabi.EtudeDeCas." +
      "Empty\032\'.com.chalabi.EtudeDeCas.Reservati" +
      "onList\022j\n\021UpdateReservation\0220.com.chalab" +
      "i.EtudeDeCas.UpdateReservationRequest\032#." +
      "com.chalabi.EtudeDeCas.Reservation\022x\n\021De" +
      "leteReservation\0220.com.chalabi.EtudeDeCas" +
      ".DeleteReservationRequest\0321.com.chalabi." +
      "EtudeDeCas.DeleteReservationResponseB \n\034" +
      "com.chalabi.EtudeDeCas.stubsP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_chalabi_EtudeDeCas_Client_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_chalabi_EtudeDeCas_Client_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_chalabi_EtudeDeCas_Client_descriptor,
        new java.lang.String[] { "Id", "Nom", "Prenom", "Email", "Telephone", });
    internal_static_com_chalabi_EtudeDeCas_Chambre_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_chalabi_EtudeDeCas_Chambre_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_chalabi_EtudeDeCas_Chambre_descriptor,
        new java.lang.String[] { "Id", "Type", "Prix", "Disponible", });
    internal_static_com_chalabi_EtudeDeCas_Reservation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_chalabi_EtudeDeCas_Reservation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_chalabi_EtudeDeCas_Reservation_descriptor,
        new java.lang.String[] { "Id", "Client", "Chambre", "DateDebut", "DateFin", "Preferences", });
    internal_static_com_chalabi_EtudeDeCas_ReservationList_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_chalabi_EtudeDeCas_ReservationList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_chalabi_EtudeDeCas_ReservationList_descriptor,
        new java.lang.String[] { "Reservations", });
    internal_static_com_chalabi_EtudeDeCas_GetReservationRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_chalabi_EtudeDeCas_GetReservationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_chalabi_EtudeDeCas_GetReservationRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_chalabi_EtudeDeCas_DeleteReservationRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_chalabi_EtudeDeCas_DeleteReservationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_chalabi_EtudeDeCas_DeleteReservationRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_chalabi_EtudeDeCas_UpdateReservationRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_chalabi_EtudeDeCas_UpdateReservationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_chalabi_EtudeDeCas_UpdateReservationRequest_descriptor,
        new java.lang.String[] { "Id", "Reservation", });
    internal_static_com_chalabi_EtudeDeCas_DeleteReservationResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_chalabi_EtudeDeCas_DeleteReservationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_chalabi_EtudeDeCas_DeleteReservationResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_chalabi_EtudeDeCas_Empty_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_chalabi_EtudeDeCas_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_chalabi_EtudeDeCas_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}