object CaesarCipher {
  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isLower) 'a' else 'A'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  def decrypt(text: String, shift: Int): String = {
    encrypt(text, 26 - shift)
  }

  def cipher(text: String, shift: Int, operation: (String, Int) => String): String = {
    operation(text, shift)
  }

  def main(args: Array[String]): Unit = {
    print("Enter the text to encrypt: ")
    val plaintext = scala.io.StdIn.readLine()

  
    print("Enter the shift value: ")
    val shift = scala.io.StdIn.readInt()

    val encryptedText = cipher(plaintext, shift, encrypt)
    println(s"Encrypted: $encryptedText")

    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted: $decryptedText")
  }
}
