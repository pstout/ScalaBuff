// Generated by ScalaBuff, the Scala protocol buffer compiler. DO NOT EDIT!
// source: complex.proto

package resources.generated

final case class ComplexMessage (
	firstField: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY,
	secondField: Option[String] = None,
	nestedOuterField: Option[ComplexMessage.Nested] = None,
	simpleEnumField: Vector[ComplexMessage.SimpleEnum.EnumVal] = Vector.empty[ComplexMessage.SimpleEnum.EnumVal]
) extends com.google.protobuf.GeneratedMessageLite
	with hr.sandrogrzicic.scalabuff.runtime.Message[ComplexMessage] {

	def getSecondField = secondField.getOrElse("")
	def getNestedOuterField = nestedOuterField.getOrElse(ComplexMessage.Nested.defaultInstance)

	def setSecondField(_f: String) = copy(secondField = _f)
	def setNestedOuterField(_f: ComplexMessage.Nested) = copy(nestedOuterField = _f)
	def setSimpleEnumField(_i: Int, _v: ComplexMessage.SimpleEnum.EnumVal) = copy(simpleEnumField = simpleEnumField.updated(_i, _v))
	def addSimpleEnumField(_f: ComplexMessage.SimpleEnum.EnumVal) = copy(simpleEnumField = simpleEnumField :+ _f)
	def addAllSimpleEnumField(_f: ComplexMessage.SimpleEnum.EnumVal*) = copy(simpleEnumField = simpleEnumField ++ _f)
	def addAllSimpleEnumField(_f: TraversableOnce[ComplexMessage.SimpleEnum.EnumVal]) = copy(simpleEnumField = simpleEnumField ++ _f)

	def clearFirstField = copy(firstField = com.google.protobuf.ByteString.EMPTY)
	def clearSecondField = copy(secondField = None)
	def clearNestedOuterField = copy(nestedOuterField = None)
	def clearSimpleEnumField = copy(simpleEnumField = Vector.empty[ComplexMessage.SimpleEnum.EnumVal])

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeBytes(1, firstField)
		if (secondField.isDefined) output.writeString(2, secondField.get)
		if (nestedOuterField.isDefined) output.writeMessage(3, nestedOuterField.get)
		for (_v <- simpleEnumField) output.writeEnum(4, _v)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeBytesSize(1, firstField)
		if (secondField.isDefined) size += computeStringSize(2, secondField.get)
		if (nestedOuterField.isDefined) size += computeMessageSize(3, nestedOuterField.get)
		for (_v <- simpleEnumField) size += computeEnumSize(4, _v)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): ComplexMessage = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var _firstField: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY
		var _secondField: Option[String] = secondField
		var _nestedOuterField: Option[ComplexMessage.Nested] = nestedOuterField
		val _simpleEnumField: collection.mutable.Buffer[ComplexMessage.SimpleEnum.EnumVal] = simpleEnumField.toBuffer

		def _newMerged = ComplexMessage(
			_firstField,
			_secondField,
			_nestedOuterField,
			Vector(_simpleEnumField: _*)
		)
		while (true) in.readTag match {
			case 0 => return _newMerged
			case 10 => _firstField = in.readBytes()
			case 18 => _secondField = in.readString()
			case 26 => in.readMessage(_nestedOuterField.orElse({
				_nestedOuterField = ComplexMessage.Nested.defaultInstance
				_nestedOuterField
			}).get, _emptyRegistry)
			case 34 => _simpleEnumField += ComplexMessage.SimpleEnum.valueOf(in.readEnum())
			case default => if (!in.skipField(default)) return _newMerged
		}
		null // compiler needs a return value
	}

	def mergeFrom(m: ComplexMessage) = {
		ComplexMessage(
			m.firstField,
			m.secondField.orElse(secondField),
			m.nestedOuterField.orElse(nestedOuterField),
			simpleEnumField ++ m.simpleEnumField
		)
	}

	def getDefaultInstanceForType = ComplexMessage.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = this
	def toBuilder = this
}

object ComplexMessage {
	@reflect.BeanProperty val defaultInstance = new ComplexMessage()

	val FIRST_FIELD_FIELD_NUMBER = 1
	val SECOND_FIELD_FIELD_NUMBER = 2
	val NESTED_OUTER_FIELD_FIELD_NUMBER = 3
	val SIMPLE_ENUM_FIELD_FIELD_NUMBER = 4

	object SimpleEnum extends hr.sandrogrzicic.scalabuff.runtime.Enum {
		sealed trait EnumVal extends Value
		val _UNINITIALIZED = new EnumVal { val name = id; val id = throw new hr.sandrogrzicic.scalabuff.runtime.UninitializedEnumException(SimpleEnum.getClass.getName) }

		val KEY_NAME = new EnumVal { val name = "KEY_NAME"; val id = 0 }

		val KEY_NAME_VALUE = 0

		def valueOf(id: Int) = id match {
			case 0 => KEY_NAME
			case _default => throw new hr.sandrogrzicic.scalabuff.runtime.UnknownEnumException(_default)
		}
		val internalGetValueMap = new com.google.protobuf.Internal.EnumLiteMap[EnumVal] {
			def findValueByNumber(id: Int): EnumVal = valueOf(id)
		}
	}

	final case class Nested (
		nestedField: String = "",
		nestedEnum: Option[ComplexMessage.SimpleEnum.EnumVal] = None
	) extends com.google.protobuf.GeneratedMessageLite
		with hr.sandrogrzicic.scalabuff.runtime.Message[Nested] {


		def setNestedEnum(_f: ComplexMessage.SimpleEnum.EnumVal) = copy(nestedEnum = _f)

		def clearNestedField = copy(nestedField = "")
		def clearNestedEnum = copy(nestedEnum = None)

		def writeTo(output: com.google.protobuf.CodedOutputStream) {
			output.writeString(1, nestedField)
			if (nestedEnum.isDefined) output.writeEnum(2, nestedEnum.get)
		}

		lazy val getSerializedSize = {
			import com.google.protobuf.CodedOutputStream._
			var size = 0
			size += computeStringSize(1, nestedField)
			if (nestedEnum.isDefined) size += computeEnumSize(2, nestedEnum.get)

			size
		}

		def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Nested = {
			import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
			var _nestedField: String = ""
			var _nestedEnum: Option[ComplexMessage.SimpleEnum.EnumVal] = nestedEnum

			def _newMerged = Nested(
				_nestedField,
				_nestedEnum
			)
			while (true) in.readTag match {
				case 0 => return _newMerged
				case 10 => _nestedField = in.readString()
				case 18 => _nestedEnum = ComplexMessage.SimpleEnum.valueOf(in.readEnum())
				case default => if (!in.skipField(default)) return _newMerged
			}
			null // compiler needs a return value
		}

		def mergeFrom(m: Nested) = {
			Nested(
				m.nestedField,
				m.nestedEnum.orElse(nestedEnum)
			)
		}

		def getDefaultInstanceForType = Nested.defaultInstance
		def clear = getDefaultInstanceForType
		def isInitialized = true
		def build = this
		def buildPartial = this
		def newBuilderForType = this
		def toBuilder = this
	}

	object Nested {
		@reflect.BeanProperty val defaultInstance = new Nested()

		val NESTED_FIELD_FIELD_NUMBER = 1
		val NESTED_ENUM_FIELD_NUMBER = 2

	}
}
final case class AnotherMessage (
	fieldNested: ComplexMessage.Nested = ComplexMessage.Nested.defaultInstance,
	fieldEnum: ComplexMessage.SimpleEnum.EnumVal = ComplexMessage.SimpleEnum._UNINITIALIZED
) extends com.google.protobuf.GeneratedMessageLite
	with hr.sandrogrzicic.scalabuff.runtime.Message[AnotherMessage] {



	def clearFieldNested = copy(fieldNested = ComplexMessage.Nested.defaultInstance)
	def clearFieldEnum = copy(fieldEnum = ComplexMessage.SimpleEnum._UNINITIALIZED)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeMessage(1, fieldNested)
		output.writeEnum(2, fieldEnum)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeMessageSize(1, fieldNested)
		size += computeEnumSize(2, fieldEnum)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): AnotherMessage = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		val _fieldNested: ComplexMessage.Nested = ComplexMessage.Nested.defaultInstance
		var _fieldEnum: ComplexMessage.SimpleEnum.EnumVal = ComplexMessage.SimpleEnum._UNINITIALIZED

		def _newMerged = AnotherMessage(
			_fieldNested,
			_fieldEnum
		)
		while (true) in.readTag match {
			case 0 => return _newMerged
			case 10 => in.readMessage(_fieldNested, _emptyRegistry)
			case 18 => _fieldEnum = ComplexMessage.SimpleEnum.valueOf(in.readEnum())
			case default => if (!in.skipField(default)) return _newMerged
		}
		null // compiler needs a return value
	}

	def mergeFrom(m: AnotherMessage) = {
		AnotherMessage(
			m.fieldNested,
			m.fieldEnum
		)
	}

	def getDefaultInstanceForType = AnotherMessage.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = this
	def toBuilder = this
}

object AnotherMessage {
	@reflect.BeanProperty val defaultInstance = new AnotherMessage()

	val FIELD_NESTED_FIELD_NUMBER = 1
	val FIELD_ENUM_FIELD_NUMBER = 2

}

object Complex {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

}