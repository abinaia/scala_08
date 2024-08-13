object CaesarCipher {

  // Encrypt a given text by shifting each letter by a certain number of places
  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      // Check if the character is a letter
      if (char.isLetter) {
        // Determine the base (starting point) of the alphabet ('a' for lowercase, 'A' for uppercase)
        val base = if (char.isLower) 'a' else 'A'
        // Calculate the new character after applying the shift
        // Modulo 26 ensures the shift wraps around the alphabet
        ((char - base + shift) % 26 + base).toChar
      } else {
        // Non-letter characters are returned as is
        char
      }
    }
  }

  // Decrypt a given text by reversing the shift applied during encryption
  def decrypt(text: String, shift: Int): String = {
    // Decryption is just encryption with the shift reversed
    encrypt(text, 26 - shift)
  }

  // A generic function to process the text using a provided operation (either encrypt or decrypt)
  def cipher(text: String, shift: Int, operation: (String, Int) => String): String = {
    operation(text, shift)
  }

  // Main function to demonstrate the Caesar Cipher
  def main(args: Array[String]): Unit = {
    val plaintext = "Hello, Caesar Cipher!"
    val shift = 3

    // Encrypt the plaintext
    val encryptedText = cipher(plaintext, shift, encrypt)
    println(s"Encrypted: $encryptedText")

    // Decrypt the encrypted text
    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted: $decryptedText")
  }
}
