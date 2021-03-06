/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.kafka.avroSchema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ClientEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5621228407799393608L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ClientEvent\",\"namespace\":\"com.kafka.avroSchema\",\"fields\":[{\"name\":\"identifier\",\"type\":\"string\"},{\"name\":\"email\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ClientEvent> ENCODER =
      new BinaryMessageEncoder<ClientEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ClientEvent> DECODER =
      new BinaryMessageDecoder<ClientEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ClientEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ClientEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ClientEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ClientEvent>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ClientEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ClientEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ClientEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ClientEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence identifier;
   private java.lang.CharSequence email;
   private java.lang.CharSequence type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ClientEvent() {}

  /**
   * All-args constructor.
   * @param identifier The new value for identifier
   * @param email The new value for email
   * @param type The new value for type
   */
  public ClientEvent(java.lang.CharSequence identifier, java.lang.CharSequence email, java.lang.CharSequence type) {
    this.identifier = identifier;
    this.email = email;
    this.type = type;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return identifier;
    case 1: return email;
    case 2: return type;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: identifier = (java.lang.CharSequence)value$; break;
    case 1: email = (java.lang.CharSequence)value$; break;
    case 2: type = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'identifier' field.
   * @return The value of the 'identifier' field.
   */
  public java.lang.CharSequence getIdentifier() {
    return identifier;
  }


  /**
   * Sets the value of the 'identifier' field.
   * @param value the value to set.
   */
  public void setIdentifier(java.lang.CharSequence value) {
    this.identifier = value;
  }

  /**
   * Gets the value of the 'email' field.
   * @return The value of the 'email' field.
   */
  public java.lang.CharSequence getEmail() {
    return email;
  }


  /**
   * Sets the value of the 'email' field.
   * @param value the value to set.
   */
  public void setEmail(java.lang.CharSequence value) {
    this.email = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.lang.CharSequence getType() {
    return type;
  }


  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /**
   * Creates a new ClientEvent RecordBuilder.
   * @return A new ClientEvent RecordBuilder
   */
  public static com.kafka.avroSchema.ClientEvent.Builder newBuilder() {
    return new com.kafka.avroSchema.ClientEvent.Builder();
  }

  /**
   * Creates a new ClientEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ClientEvent RecordBuilder
   */
  public static com.kafka.avroSchema.ClientEvent.Builder newBuilder(com.kafka.avroSchema.ClientEvent.Builder other) {
    if (other == null) {
      return new com.kafka.avroSchema.ClientEvent.Builder();
    } else {
      return new com.kafka.avroSchema.ClientEvent.Builder(other);
    }
  }

  /**
   * Creates a new ClientEvent RecordBuilder by copying an existing ClientEvent instance.
   * @param other The existing instance to copy.
   * @return A new ClientEvent RecordBuilder
   */
  public static com.kafka.avroSchema.ClientEvent.Builder newBuilder(com.kafka.avroSchema.ClientEvent other) {
    if (other == null) {
      return new com.kafka.avroSchema.ClientEvent.Builder();
    } else {
      return new com.kafka.avroSchema.ClientEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for ClientEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ClientEvent>
    implements org.apache.avro.data.RecordBuilder<ClientEvent> {

    private java.lang.CharSequence identifier;
    private java.lang.CharSequence email;
    private java.lang.CharSequence type;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.kafka.avroSchema.ClientEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.identifier)) {
        this.identifier = data().deepCopy(fields()[0].schema(), other.identifier);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.email)) {
        this.email = data().deepCopy(fields()[1].schema(), other.email);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing ClientEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.kafka.avroSchema.ClientEvent other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.identifier)) {
        this.identifier = data().deepCopy(fields()[0].schema(), other.identifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.email)) {
        this.email = data().deepCopy(fields()[1].schema(), other.email);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'identifier' field.
      * @return The value.
      */
    public java.lang.CharSequence getIdentifier() {
      return identifier;
    }


    /**
      * Sets the value of the 'identifier' field.
      * @param value The value of 'identifier'.
      * @return This builder.
      */
    public com.kafka.avroSchema.ClientEvent.Builder setIdentifier(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.identifier = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'identifier' field has been set.
      * @return True if the 'identifier' field has been set, false otherwise.
      */
    public boolean hasIdentifier() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'identifier' field.
      * @return This builder.
      */
    public com.kafka.avroSchema.ClientEvent.Builder clearIdentifier() {
      identifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'email' field.
      * @return The value.
      */
    public java.lang.CharSequence getEmail() {
      return email;
    }


    /**
      * Sets the value of the 'email' field.
      * @param value The value of 'email'.
      * @return This builder.
      */
    public com.kafka.avroSchema.ClientEvent.Builder setEmail(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.email = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'email' field.
      * @return This builder.
      */
    public com.kafka.avroSchema.ClientEvent.Builder clearEmail() {
      email = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.lang.CharSequence getType() {
      return type;
    }


    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.kafka.avroSchema.ClientEvent.Builder setType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.kafka.avroSchema.ClientEvent.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ClientEvent build() {
      try {
        ClientEvent record = new ClientEvent();
        record.identifier = fieldSetFlags()[0] ? this.identifier : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.email = fieldSetFlags()[1] ? this.email : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ClientEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<ClientEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ClientEvent>
    READER$ = (org.apache.avro.io.DatumReader<ClientEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.identifier);

    out.writeString(this.email);

    out.writeString(this.type);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.identifier = in.readString(this.identifier instanceof Utf8 ? (Utf8)this.identifier : null);

      this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);

      this.type = in.readString(this.type instanceof Utf8 ? (Utf8)this.type : null);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.identifier = in.readString(this.identifier instanceof Utf8 ? (Utf8)this.identifier : null);
          break;

        case 1:
          this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);
          break;

        case 2:
          this.type = in.readString(this.type instanceof Utf8 ? (Utf8)this.type : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










