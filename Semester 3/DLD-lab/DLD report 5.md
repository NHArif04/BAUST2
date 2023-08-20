## Title: 
Design and Implementation of Binary to Gray Code and Gray to Binary Code Converters

## Objectives:
- To understand conversion between binary code and gray code.
- To design and implement the converter circuits using logic gates.
- To test the circuits by providing all possible input combinations.

## Apparatus:
- Breadboard
- Connecting wires
- Logic gates (XOR)
- LEDs and resistors

## Components:
- IC 7486 for XOR gate
- Push buttons
- Power supply

## Theory:
Gray code is a binary numeral system where two successive values differ in only one bit. It is also known as reflected binary code.

Binary code is a way of representing data using only two symbols, typically 0 and 1.

Binary to Gray code conversion:

- The MSB of the Gray code is equal to the MSB of the binary code.
- Other bits of the Gray code can be obtained by XORing the current and previous binary bits.

Gray code to binary conversion:

- The MSB of the binary code is equal to the MSB of the Gray code.
- Other bits of the binary code can be obtained by checking the Gray code bit at that index. If it is 0, copy the previous binary bit, else copy its invert.

### Table:

## Circuit Diagram:

### Procedure:
1. Design the logic circuits based on the conversion principles.
2. Connect the ICs and logic gates on the breadboard.
3. Use push buttons to input binary values and simulate Gray values.
4. Observe the output LEDs for each input combination.
5. Record the results.

### Results:
The binary to Gray and Gray to binary converters exhibited correct functionality for all tested input combinations. The LEDs accurately reflected the corresponding Gray or binary outputs.

## Conclusion:
This experiment successfully showcased the design and implementation of binary to Gray code and Gray to binary code converters using logic gates. The observed outcomes of the circuits matched the anticipated results. The practical application of digital logic concepts and understanding of Gray code fundamentals were effectively reinforced through this experiment.
