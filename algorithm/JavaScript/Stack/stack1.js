class Stack {

  constructor() {
    this._stack = [];
  }

  push(item) {
    this._stack[this._stack.length] = item;
  }

  pop() {
    if (this._stack.length == 0) {
      return null;
    }
    const top = this._stack[this._stack.length - 1]
    this._stack.splice(this._stack.length - 1, 1);
    return top;
  }
}
const stack = new Stack();

stack.push('a');
stack.push('b');
stack.push('c');

console.log(stack.pop());
console.log(stack.pop());
console.log(stack.pop());
console.log(stack.pop());
