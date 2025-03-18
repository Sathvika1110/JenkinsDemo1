def is_palindrome(s):
    # Remove any spaces and convert to lowercase for case-insensitive comparison
    s = s.replace(" ", "").lower()

    # Reverse the string and check if it is the same as the original
    return s == s[::-1]

# Hardcoded string to check
input_string = "racecar"  # Change this string to any other string you'd like to check

if is_palindrome(input_string):
    print(f"'{input_string}' is a palindrome.")
else:
    print(f"'{input_string}' is not a palindrome.")

